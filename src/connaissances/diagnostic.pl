 /* I. prechauffage a cyclone*/


teneur(o2c,T,_X,haut):-T>=0.6,!.
teneur(o2c,T,_X,bas):-T=<0.1,!.
teneur(o2c,_T,_X,normal).

teneur(coc,_T,X,haut_b):-X>=0.25.
teneur(coc,_T,X,bas_b):-X=<0.
teneur(coc,T,_X,haut):-T>=0.25,!.
teneur(coc,T,_X,bas):-T=<0,!.
teneur(coc,_T,_X,normal).


teneur(o2f,T,_X,haut):-T>=0.6,!.
teneur(o2f,T,_X,bas):-T=<0.1,!.
teneur(o2f,_T,_X,normal).

teneur(cop,_T,X,haut_b):-X>=0.25.
teneur(cop,_T,X,bas_b):-X=<0.
teneur(cop,T,_X,haut):-T>=0.25,!.
teneur(cop,T,_X,bas):-T=<0,!.
teneur(cop,_T,_X,normal).


pression(a50p1,P,_X,haut):-P>=60,!.
pression(a50p1,P,_X,bas):-P=<40,!.
pression(a50p1,_P,_X,normal).

pression(a52p1,_P,X,haut_b):-X>=60.
pression(a52p1,_P,X,bas_b):-X=<60.
pression(a52p1,P,_X,haut):-P>=35,!.
pression(a52p1,P,_X,bas):-P=<25,!.
pression(a52p1,_P,_X,normal).


pression(a53p1,P,_X,haut):-P>=20,!.
pression(a53p1,P,_X,bas):-P=<18,!.
pression(a53p1,_P,_X,normal).




pression(a54p2,P,_X,haut):-P>=10,!.
pression(a54p2,P,_X,bas):-P=<8,!.
pression(a54p2,_P,_X,normal).

pression(v07p1,_P,X,haut_b):-X>=60.
pression(v07p1,_P,X,bas_b):-X=<60.
pression(v07p1,P,_X,haut):-P>=30,!.
pression(v07p1,P,_X,bas):-P=<28,!.
pression(v07p1,_P,_X,normal).


pression(w01p3,P,_X,haut):-P>=2,!.
pression(w01p3,P,_X,bas):-P=<1,!.
pression(w01p3,_P,_X,normal).


pression(w01p1,P,_X,haut):-P>=1,!.
pression(w01p1,P,_X,bas):-P=<0.5,!.
pression(w01p1,_P,_X,normal).

pression(k01p1,_P,X,haut_b):-X>=60.
pression(k01p1,_P,X,bas_b):-X=<60.
pression(k01p1,P,_X,haut):-P>=1,!.
pression(k01p1,P,_X,bas):-P=<0.5,!.
pression(k01p1,_P,_X,normal).

temperature(a54t1,_T,X,haut_b):-X>=860.
temperature(a54t1,_T,X,bas_b):-X=<860.
temperature(a54t1,T,_X,haut):-T>=860,!.
temperature(a54t1,T,_X,bas):-T=<820,!.
temperature(a54t1,_T,_X,normal).

temperature(a54t2,_T,X,haut_b):-X>=860.
temperature(a54t2,_T,X,bas_b):-X=<860.
temperature(a54t2,T,_X,haut):-T>=830,!.
temperature(a54t2,T,_X,bas):-T=<820,!.
temperature(a54t2,_T,_X,normal).


temperature(w01t1,_T,X,haut_b):-X>=860.
temperature(w01t1,_T,X,bas_b):-X=<860.
temperature(w01t1,T,_X,haut):-T>=1400,!.
temperature(w01t1,T,_X,bas):-T=<1200,!.
temperature(w01t1,_T,_X,normal).

temperature(w01t4,_T,X,haut_b):-X>=860.
temperature(w01t4,_T,X,bas_b):-X=<860.
temperature(w01t4,T,_X,haut):-T>=1500,!.
temperature(w01t4,T,_X,bas):-T=<1200,!.
temperature(w01t4,_T,_X,normal).

temperature(tv,_T,X,haut_b):-X>=860.
temperature(tv,_T,X,bas_b):-X=<860.
temperature(tv,T,_X,haut):-T>=1800,!.
temperature(tv,T,_X,bas):-T=<1000,!.
temperature(tv,_T,_X,normal).

temperature(u01t1,_T,X,haut_b):-X>=860.
temperature(u01t1,_T,X,bas_b):-X=<860.
temperature(u01t1,T,_X,haut):-T>=150,!.
temperature(u01t1,T,_X,bas):-T=<100,!.
temperature(u01t1,_T,_X,normal).


temperature(k01t1,_T,X,haut_b):-X>=860.
temperature(k01t1,_T,X,bas_b):-X=<860.
temperature(k01t1,T,_X,haut):-T>=900,!.
temperature(k01t1,T,_X,bas):-T=<500,!.
temperature(k01t1,_T,_X,normal).

temperature(a53t2,_T,X,haut_b):-X>=860.
temperature(a53t2,_T,X,bas_b):-X=<860.
temperature(a53t2,T,_X,haut):-T>=720,!.
temperature(a53t2,T,_X,bas):-T=<700,!.
temperature(a53t2,_T,_X,normal).

temperature(a50t1,_T,X,haut_b):-X>=860.
temperature(a50t1,_T,X,bas_b):-X=<860.
temperature(a50t1,T,_X,haut):-T>=350,!.
temperature(a50t1,T,_X,bas):-T=<300,!.
temperature(a50t1,_T,_X,normal).

temperature(a52t1,_T,X,haut_b):-X>=860.
temperature(a52t1,_T,X,bas_b):-X=<860.
temperature(a52t1,T,_X,haut):-T>=555,!.
temperature(a52t1,T,_X,bas):-T=<530.
temperature(a52t1,_T,_X,normal).

temperature(a53t1,_T,X,haut_b):-X>=860.
temperature(a53t1,_T,X,bas_b):-X=<860.
temperature(a53t1,T,_X,haut):-T>=760,!.
temperature(a53t1,T,_X,bas):-T=<700,!.
temperature(a53t1,_T,_X,normal).


/* II Boite a fumme */



debit(v31f1,D,_X,haut):-D>=893,!.
debit(v31f1,D,_X,bas):-D=<850,!.
debit(v31f1,_D,_X,normal).

/* III four */


debit(v01f1,D,_X,haut):-D>=5056,!.
debit(v01f1,D,_X,bas):-D=<3280,!.
debit(v01f1,_D,_X,normal).

cons_cal(ccs,_C,X,haut):-X>=1050.
cons_cal(ccs,_C,X,bas):-X=<810.
cons_cal(ccs,C,_X,haut):-C>=1050,!.
cons_cal(ccs,C,_X,bas):-C=<810,!.
cons_cal(ccs,_C,_X,normal).

moment_four(w01X1,_M,X,haut):-X>=60.
moment_four(w01X1,_M,X,bas):-X=<20.
moment_four(w01X1,M,_X,haut):-M>=60,!.
moment_four(w01X1,M,_X,bas):-M=<20,!.
moment_four(w01X1,_M,_X,normal).


vitesse_four(w01s1,_V,X,haut):-X>=3.
vitesse_four(w01s1,_V,X,bas):-X=<1.
vitesse_four(w01s1,V,_X,haut):-V>=3,!.
vitesse_four(w01s1,V,_X,bas):-V=<1,!.
vitesse_four(w01s1,_V,_X,normal).





poids_litre(pal,_P,X,haut):-X>=1350.
poids_litre(pal,_P,X,bas):-X=<1250.
poids_litre(pal,P,_X,haut):-P>=1350,!.
poids_litre(pal,P,_X,bas):-P=<1250,!.
poids_litre(pal,_P,_X,normal).

chaux_libre(fcao,_C,X,haut):-X>=3.
chaux_libre(fcao,_C,X,bas):-X=<1.
chaux_libre(fcao,C,_X,haut):-C>=3,!.
chaux_libre(fcao,C,_X,bas):-C=<1,!.
chaux_libre(fcao,_C,_X,normal).


/* -----     regles de diagnostic -----       */



preparer_farine(O2C,_COC,_A50T1,_A50P1,_A52T1,
		_A52P2,_A53T1,_A53T2,_A53P1,_A54T1,
		_A54T2,_A54P2,X_O2C,_X_COC,_X_A50T1,_X_A50P1,_X_A52T1,
		_X_A52P2,_X_A53T1,_X_A53T2,_X_A53P1,_X_A54T1,
		_X_A54T2,_X_A54P2,marche_perturbe,ten_o2c_H):-teneur(o2c,O2C,X_O2C,haut).


preparer_farine(O2C,_COC,_A50T1,_A50P1,_A52T1,
		_A52P2,_A53T1,_A53T2,_A53P1,_A54T1,
		_A54T2,_A54P2,X_O2C,_X_COC,_X_A50T1,_X_A50P1,_X_A52T1,
		_X_A52P2,_X_A53T1,_X_A53T2,_X_A53P1,_X_A54T1,
		_X_A54T2,_X_A54P2,marche_perturbe,ten_o2c_B):-teneur(o2c,O2C,X_O2C,bas).


preparer_farine(_O2C,COC,_A50T1,_A50P1,_A52T1,
		_A52P2,_A53T1,_A53T2,_A53P1,_A54T1,
		_A54T2,_A54P2,_X_O2C,X_COC,_X_A50T1,_X_A50P1,_X_A52T1,
		_X_A52P2,_X_A53T1,_X_A53T2,_X_A53P1,_X_A54T1,
		_X_A54T2,_X_A54P2,marche_perturbe,ten_coc_HB):-teneur(coc,COC,X_COC,haut_b).


preparer_farine(_O2C,_COC,A50T1,_A50P1,_A52T1,
		_A52P2,_A53T1,_A53T2,_A53P1,_A54T1,
		_A54T2,_A54P2,_X_O2C,_X_COC,X_A50T1,_X_A50P1,_X_A52T1,
		_X_A52P2,_X_A53T1,_X_A53T2,_X_A53P1,_X_A54T1,
		_X_A54T2,_X_A54P2,marche_perturbe,temp_a50t1_HB):-temperature(a501,A50T1,X_A50T1,haut_b).

preparer_farine(_O2C,_COC,_A50T1,A50P1,_A52T1,
		_A52P2,_A53T1,_A53T2,_A53P1,_A54T1,
		_A54T2,_A54P2,_X_O2C,_X_COC,_X_A50T1,X_A50P1,_X_A52T1,
		_X_A52P2,_X_A53T1,_X_A53T2,_X_A53P1,_X_A54T1,
		_X_A54T2,_X_A54P2,marche_perturbe,pression_a50p1_H):-pression(a50p1,A50P1,X_A50P1,haut).

/* 5 */
preparer_farine(_O2C,_COC,_A50T1,_A50P1,A52T1,
		_A52P2,_A53T1,_A53T2,_A53P1,_A54T1,
		_A54T2,_A54P2,_X_O2C,_X_COC,_X_A50T1,_X_A50P1,X_A52T1,
		_X_A52P2,_X_A53T1,_X_A53T2,_X_A53P1,_X_A54T1,
		_X_A54T2,_X_A54P2,marche_perturbe,temp_a52t1_HB):-temperature(a52t1,A52T1,X_A52T1,haut_b).

preparer_farine(_O2C,_COC,_A50T1,_A50P1,A52T1,
		_A52P2,_A53T1,_A53T2,_A53P1,_A54T1,
		_A54T2,_A54P2,_X_O2C,_X_COC,_X_A50T1,_X_A50P1,X_A52T1,
		_X_A52P2,_X_A53T1,_X_A53T2,_X_A53P1,_X_A54T1,
		_X_A54T2,_X_A54P2,marche_perturbe,temp_a52t1_BB):-temperature(a52t1,A52T1,X_A52T1,bas_b).

/* 6 */
preparer_farine(_O2C,_COC,_A50T1,_A50P1,_A52T1,
		A52P2,_A53T1,_A53T2,_A53P1,_A54T1,
		_A54T2,_A54P2,_X_O2C,_X_COC,_X_A50T1,_X_A50P1,_X_A52T1,
		X_A52P2,_X_A53T1,_X_A53T2,_X_A53P1,_X_A54T1,
		_X_A54T2,_X_A54P2,marche_perturbe,pression_a52p2_HB):-pression(a52p2,A52P2,X_A52P2,haut_b).

preparer_farine(_O2C,_COC,_A50T1,_A50P1,_A52T1,
		A52P2,_A53T1,_A53T2,_A53P1,_A54T1,
		_A54T2,_A54P2,_X_O2C,_X_COC,_X_A50T1,_X_A50P1,_X_A52T1,
		X_A52P2,_X_A53T1,_X_A53T2,_X_A53P1,_X_A54T1,
		_X_A54T2,_X_A54P2,marche_perturbe,pression_a52p2_BB):-pression(a52p2,A52P2,X_A52P2,bas_b).
/* 7 */
preparer_farine(_O2C,_COC,_A50T1,_A50P1,_A52T1,
		_A52P2,A53T1,_A53T2,_A53P1,_A54T1,
		_A54T2,_A54P2,_X_O2C,_X_COC,_X_A50T1,_X_A50P1,_X_A52T1,
		_X_A52P2,X_A53T1,_X_A53T2,_X_A53P1,_X_A54T1,
		_X_A54T2,_X_A54P2,marche_perturbe,temp_a53t1_HB):-temperature(a53t1,A53T1,X_A53T1,haut_b).

preparer_farine(_O2C,_COC,_A50T1,_A50P1,_A52T1,
		_A52P2,A53T1,_A53T2,_A53P1,_A54T1,
		_A54T2,_A54P2,_X_O2C,_X_COC,_X_A50T1,_X_A50P1,_X_A52T1,
		_X_A52P2,X_A53T1,_X_A53T2,_X_A53P1,_X_A54T1,
		_X_A54T2,_X_A54P2,marche_perturbe,temp_a53t1_BB):-temperature(a53t1,A53T1,X_A53T1,bas_b).

/* 8 */
preparer_farine(_O2C,_COC,_A50T1,_A50P1,_A52T1,
		_A52P2,_A53T1,A53T2,_A53P1,_A54T1,
		_A54T2,_A54P2,_X_O2C,_X_COC,_X_A50T1,_X_A50P1,_X_A52T1,
		_X_A52P2,_X_A53T1,X_A53T2,_X_A53P1,_X_A54T1,
		_X_A54T2,_X_A54P2,marche_perturbe,temp_a53t2_HB):-temperature(a53t2,A53T2,X_A53T2,haut_b).
/* 9 */
preparer_farine(_O2C,_COC,_A50T1,_A50P1,_A52T1,
		_A52P2,_A53T1,_A53T2,A53P1,_A54T1,
		_A54T2,_A54P2,_X_O2C,_X_COC,_X_A50T1,_X_A50P1,_X_A52T1,
		_X_A52P2,_X_A53T1,_X_A53T2,X_A53P1,_X_A54T1,
		_X_A54T2,_X_A54P2,marche_perturbe,pression_a53p1_H):-pression(a53p1,A53P1,X_A53P1,haut).
preparer_farine(_O2C,_COC,_A50T1,_A50P1,_A52T1,
		_A52P2,_A53T1,_A53T2,A53P1,_A54T1,
		_A54T2,_A54P2,_X_O2C,_X_COC,_X_A50T1,_X_A50P1,_X_A52T1,
		_X_A52P2,_X_A53T1,_X_A53T2,X_A53P1,_X_A54T1,
		_X_A54T2,_X_A54P2,marche_perturbe,pression_a53p1_B):-pression(a53p1,A53P1,X_A53P1,bas).

/* 10 */
preparer_farine(_O2C,_COC,_A50T1,_A50P1,_A52T1,
		_A52P2,_A53T1,_A53T2,_A53P1,A54T1,
		_A54T2,_A54P2,_X_O2C,_X_COC,_X_A50T1,_X_A50P1,_X_A52T1,
		_X_A52P2,_X_A53T1,_X_A53T2,_X_A53P1,X_A54T1,
		_X_A54T2,_X_A54P2,marche_perturbe,temp_a54t1_HB):-temperature(a54t1,A54T1,X_A54T1,haut_b).
preparer_farine(_O2C,_COC,_A50T1,_A50P1,_A52T1,
		_A52P2,_A53T1,_A53T2,_A53P1,A54T1,
		_A54T2,_A54P2,_X_O2C,_X_COC,_X_A50T1,_X_A50P1,_X_A52T1,
		_X_A52P2,_X_A53T1,_X_A53T2,_X_A53P1,X_A54T1,
		_X_A54T2,_X_A54P2,marche_perturbe,temp_a54t1_BB):-temperature(a54t1,A54T1,X_A54T1,bas_b).
/*11 */
preparer_farine(_O2C,_COC,_A50T1,_A50P1,_A52T1,
		_A52P2,_A53T1,_A53T2,_A53P1,_A54T1,
		A54T2,_A54P2,_X_O2C,_X_COC,_X_A50T1,_X_A50P1,_X_A52T1,
		_X_A52P2,_X_A53T1,_X_A53T2,_X_A53P1,_X_A54T1,
		X_A54T2,_X_A54P2,marche_perturbe,temp_a54t2_HB):-temperature(a54t2,A54T2,X_A54T2,haut_b).
/* 12 */
preparer_farine(_O2C,_COC,_A50T1,_A50P1,_A52T1,
		_A52P2,_A53T1,_A53T2,_A53P1,_A54T1,
		_A54T2,A54P2,_X_O2C,_X_COC,_X_A50T1,_X_A50P1,_X_A52T1,
		_X_A52P2,_X_A53T1,_X_A53T2,_X_A53P1,_X_A54T1,
		_X_A54T2,X_A54P2,marche_perturbe,pression_a54p2_H):-pression(a54p2,A54P2,X_A54P2,haut).

preparer_farine(_O2C,_COC,_A50T1,_A50P1,_A52T1,
		_A52P2,_A53T1,_A53T2,_A53P1,_A54T1,
		_A54T2,A54P2,_X_O2C,_X_COC,_X_A50T1,_X_A50P1,_X_A52T1,
		_X_A52P2,_X_A53T1,_X_A53T2,_X_A53P1,_X_A54T1,
		_X_A54T2,X_A54P2,marche_perturbe,pression_a54p2_B):-pression(a54p2,A54P2,X_A54P2,bas).


/* Boite � fum�e */
/* 1 */
calcination_farine(O2F,_COP,_W01P3,_W01P1,_W01T1,_V31F1,
		   X_O2F,_X_COP_,_X_W01P3,_X_W01P1,_X_W01T1,_X_V31F1,
		   deplacement_zone,ten_o2f_H):-teneur(o2f,O2F,X_O2F,haut).
calcination_farine(O2F,_COP,_W01P3,_W01P1,_W01T1,_V31F1, X_O2F,_X_COP_,_X_W01P3,_X_W01P1,_X_W01T1,_X_V31F1,
		   deplacement_zone,ten_o2f_B):-teneur(o2f,O2F,X_O2F,bas).
/*2*/
calcination_farine(_O2F,COP,_W01P3,_W01P1,_W01T1,_V31F1, _X_O2F,X_COP,_X_W01P3,_X_W01P1,_X_W01T1,_X_V31F1,
		   deplacement_zone,ten_cop_HB):-teneur(cop,COP,X_COP,haut_b).
calcination_farine(_O2F,COP,_W01P3,_W01P1,_W01T1,_V31F1,_X_O2F,X_COP,_X_W01P3,_X_W01P1,_X_W01T1,_X_V31F1,
		   deplacement_zone,ten_cop_BB):-teneur(cop,COP,X_COP,bas_b).
/*3*/
calcination_farine(_O2F,_COP,W01P3,_W01P1,_W01T1,_V31F1, _X_O2F,_X_COP,X_W01P3,_X_W01P1,_X_W01T1,_X_V31F1,
		   deplacement_zone,ten_w01p3_H):-pression(w01p3,W01P3,X_W01P3,haut).
calcination_farine(_O2F,_COP,W01P3,_W01P1,_W01T1,_V31F1, _X_O2F,_X_COP,X_W01P3,_X_W01P1,_X_W01T1,_X_V31F1,
		   deplacement_zone,ten_w01p3_B):-pression(w01p3,W01P3,X_W01P3,bas).
/*4*/
calcination_farine(_O2F,_COP,_W01P3,W01P1,_W01T1,_V31F1, _X_O2F,_X_COP,_X_W01P3,X_W01P1,_X_W01T1,_X_V31F1,
		   deplacement_zone,ten_w01p1_H):-pression(w01p1,W01P1,X_W01P1,haut).
calcination_farine(_O2F,_COP,_W01P3,W01P1,_W01T1,_V31F1, _X_O2F,_X_COP,_X_W01P3,X_W01P1,_X_W01T1,_X_V31F1,
		   deplacement_zone,ten_w01p1_B):-pression(w01p1,W01P1,X_W01P1,bas).
/*5*/
calcination_farine(_O2F,_COP,_W01P3,_W01P1,W01T1,_V31F1, _X_O2F,_X_COP,_X_W01P3,_X_W01P1,X_W01T1,_X_V31F1,
		   deplacement_zone,ten_w01t1_HB):-temperature(w01t1,W01T1,X_W01T1,haut_b).
calcination_farine(_O2F,_COP,_W01P3,_W01P1,W01T1,_V31F1, _X_O2F,_X_COP,_X_W01P3,_X_W01P1,X_W01T1,_X_V31F1,
		   deplacement_zone,ten_w01t1_BB):-temperature(w01t1,W01T1,X_W01T1,bas_b).
/*6*/
calcination_farine(_O2F,_COP,_W01P3,_W01P1,_W01T1,V31F1, _X_O2F,_X_COP,_X_W01P3,_X_W01P1,_X_W01T1,X_V31F1,
		   deplacement_zone,debit_v31f1_H):-debit(v31f1,V31F1,X_V31F1,haut).
calcination_farine(_O2F,_COP,_W01P3,_W01P1,_W01T1,V31F1, _X_O2F,_X_COP,_X_W01P3,_X_W01P1,_X_W01T1,X_V31F1,
		   deplacement_zone,debit_v31f1_B):-debit(v31f1,V31F1,X_V31F1,bas).

/* Four */

/*1*/
clinkerisation(V01F1,_W01X1,_W01S1,X_V01F1,_X_W01X1,_X_W01S1,mauvais_clinker,debit_v01f1_H):-debit(v01f1,V01F1,X_V01F1,haut).
clinkerisation(V01F1,_W01X1,_W01S1,X_V01F1,_X_W01X1,_X_W01S1,mauvais_clinker,debit_v01f1_B):-debit(v01f1,V01F1,X_V01F1,bas).
/*2*/
clinkerisation(_V01F1,W01X1,_W01S1,_X_V01F1,X_W01X1,_X_W01S1,mauvais_clinker,debit_w01x1_HB):-debit(w01x1,W01X1,X_W01X1,haut_b).
/*3*/
clinkerisation(_V01F1,_W01X1,W01S1,_X_V01F1,_X_W01X1,X_W01S1,mauvais_clinker,debit_w01s1_HB):-debit(w01s1,W01S1,X_W01S1,haut_b).
clinkerisation(_V01F1,_W01X1,W01S1,_X_V01F1,_X_W01X1,X_W01S1,mauvais_clinker,debit_w01s1_BB):-debit(w01s1,W01S1,X_W01S1,bas_b).






















































































































































































































