from time import sleep
from bs4 import BeautifulSoup
from selenium import webdriver
from selenium.webdriver.common.by import By


def main():
    driver = webdriver.Chrome()
    driver.maximize_window()
    driver.get("https://weather.com")
    sleep(5)

    # Scroll down to load more content
    driver.execute_script("window.scrollTo(0, window.scrollY + 500)")

    # Find the current temperature in centigrade
    current_temp_element = driver.find_element(By.CSS_SELECTOR, "span.CurrentConditions--tempValue--MHmYY")
    current_temp = current_temp_element.text if current_temp_element else "N/A"

    # Print out the current temperature
    print(f"Current Temperature: {current_temp}°C")

    # Scroll down again to ensure all elements are visible
    driver.execute_script("window.scrollTo(0, window.scrollY + 500)")
    sleep(10)

    # Find and print temperatures for Morning, Afternoon, Evening, and Overnight
    soup = BeautifulSoup(driver.page_source, "html.parser")

    # Locate the section containing the temperature information
    forecast_section = soup.find('section', {'aria-label': "Today's Forecast for Suleja, Niger"})

    if forecast_section:
        time_periods = ["Morning", "Afternoon", "Evening", "Overnight"]

        for period in time_periods:
            period_element = forecast_section.find('h3', text=period)
            if period_element:
                temp_value = period_element.find_next("div", class_="Column--temp--1sO_J").text
                print(f"{period} Temperature: {temp_value}°C")
            else:
                print(f"Could not find temperature for {period}.")
    else:
        print("Could not find forecast section.")

    driver.quit()


if __name__ == "__main__":
    main()



# 3. Navigate any browser to https://weather.com/ get the current temperature  and  print  it  out  in  the  terminal.
# Then print out the temperature for Morning, Afternoon, Evening,and Overnight
