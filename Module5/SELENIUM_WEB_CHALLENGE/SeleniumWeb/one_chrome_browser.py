from time import sleep

from selenium import webdriver
from selenium.webdriver.common.by import By
import chromedriver_autoinstaller
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager


def main():
    driver = webdriver.Chrome()
    #driver = webdriver.Chrome(service=Service(ChromeDriverManager(version="118.0.5993.70").install()))
    driver.get("https://www.facebook.com")
    sleep(2)

    email_field = driver.find_element(By.CSS_SELECTOR, "#email")
    password_field = driver.find_element(By.CSS_SELECTOR, "#pass")

    email_field.send_keys("junnbeutie@gmail.com")
    password_field.send_keys("453645")

    login_button = driver.find_element(By.TAG_NAME, "button")
    login_button.click()
    driver.close()

if __name__ == "__main__":
    main()

# Using the Chrome browser navigate to https://www.facebook.com/
# fill in the email/phone and password text box then click the Login Button
