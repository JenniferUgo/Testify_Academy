from time import sleep

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

# Initialize the WebDriver (choose your preferred browser)
driver = webdriver.Chrome()  # Make sure you have the Chrome driver installed

# Open the YouTube video
video_url = "https://youtu.be/q_p31M_EXLM?si=fkIksR9rEEsPsNHk"
driver.maximize_window()
driver.get(video_url)

sleep(5)
# Scroll down to load comments
#driver.execute_script("window.scrollTo(0, document.body.scrollHeight);")
driver.execute_script("window.scrollTo(0, window.scrollY + 500)")
# Wait for at least 2 comments to be visible
comments = WebDriverWait(driver, 20).until(EC.presence_of_all_elements_located((By.CSS_SELECTOR, "#content #content-text")))
comments = comments[:2]

# Get the first two comments
for i, comment in enumerate(comments):
    print(f"Comment {i+1}: {comment.text}")

# Close the browser
driver.quit()





# Using any browser navigate to any Youtube video of your choice,
# allow your script to wait for the comments to load thenget the first two comments, and print them in the terminal.