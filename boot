100 REMark Dithvide dual screen driver
110 REMark (c)Omega www.omega.webnode.com
120 :
130 REMark Allocate code + stack size
140 code_size=312+512
150 a=ALCHP(code_size+32768)
160 LBYTES dvdrv_bin,a
170 scr1=131072
180 scr2=a+code_size
190 STOP
200 :
210 DEFine PROCedure r (mod)
220  LBYTES "2_dvd",scr2
230  LBYTES "1_dvd",scr1
240  SELect ON mod =0,4,8: CALL a,mod
250 END DEFine 
260 :
270 REMark END
