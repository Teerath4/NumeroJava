# NumeroJava
This is a code of Numerology Calculator. The project provides a comprehensive tool for calculating key numerology numbers, including the Basic Number, Destiny Number, Maha Dasha, and Antar Dasha. 
The program works by taking in the present year and date of birth of the user.
The present year is taken inorder to calculate the Maha Dasha upto the current year and to calculate Antar Dasha from 5 years bach to 5 years ahead from the present time, this is not a compulsory input and can be removed with few changes.
The complete date of birth is then split into date month and year to calculate the factors.
Basic number is simple addition of digits of the date and destiny number is the sum of digits of the entire date of birth, the sum will be another two digit number who's digits will be required to be added again.
Maha Dasha and Antar Dasha calculations are more complex and give information of ruling numbers for a specific period of time.
Maha Dasha of numbers is calculated from birth year upto the present year.
Antar Dasha is calculated from 5 years ago to 5 years after the current time
For Antar Dasha calculation it is necessary to import java.time.localdate and java.time.dayofweek inorder to get the day on the birth date of each year as the days hold certain numeric value which is required for the calculation.
