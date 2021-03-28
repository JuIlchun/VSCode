import time

from selenium import webdriver

id = ('1901114') #input()
pw = ('Hd!Sd!Wnm1') #input()

driver = webdriver.Chrome('/Users/ubit/VS code/python/chromedriver')
driver.get('https://eclass.kunsan.ac.kr/Main.do?cmd=viewHome&userDTO.localeKey=ko')

driver.find_element_by_id('id').send_keys(id)
driver.find_element_by_id('pw').send_keys(pw)
driver.find_element_by_class_name('loginBtn').click()
driver.implicitly_wait(5)

driver.get('https://eclass.kunsan.ac.kr/Main.do?cmd=moveMenu&mainDTO.parentMenuId=menu_00026&mainDTO.menuId=menu_00031')
driver.execute_script("javascript:viewStudyHome('2021111296301')")