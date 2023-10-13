from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

# Initialize the Firefox WebDriver
driver = webdriver.Firefox()

# Navigate to Google
driver.get("https://www.google.com")

# Find the search box and enter "Python"
search_box = driver.find_element(By.NAME, "q")
search_box.send_keys("Python")

# Press Enter
search_box.send_keys(Keys.RETURN)

# Wait for the search results to load
wait = WebDriverWait(driver, 10)
wait.until(EC.presence_of_element_located((By.ID, "search")))

# Find the element containing the brief text
brief_element = driver.find_element(By.CLASS_NAME, "kno-rdesc")

# Extract and print the brief text
print(brief_element.text)

# Close the browser
driver.close()





# Using the firefox browser navigate to https://www.google.com/ enter the text Python in the search box,
# then send the Enter key. Get the text from the Wikipedia brief on the right side and print the value in the console