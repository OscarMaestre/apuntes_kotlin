KOTLINC=kotlinc


.SUFFIXES: .jar .kt

all: cadenas_basicas.jar programa_1_saludo.jar programa_2_saludo_selectivo.jar \
        programa_3_sumas_n.jar programa_4_operaciones_selectivas.jar \
        programa_5_tablas.jar programa_6_tabla_primos.jar \
        programa_7_adivina_numeros.jar

.kt.jar:
	$(KOTLINC) $^ -include-runtime -d $@

clean:
	rm *.jar
