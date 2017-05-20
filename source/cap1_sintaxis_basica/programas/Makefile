KOTLINC=kotlinc


.SUFFIXES: .jar .kt

all: cadenas_basicas.jar programa_1_saludo.jar programa_2_saludo_selectivo.jar \
        programa_3_sumas_n.jar

.kt.jar:
	$(KOTLINC) $^ -include-runtime -d $@

clean:
	rm *.jar
