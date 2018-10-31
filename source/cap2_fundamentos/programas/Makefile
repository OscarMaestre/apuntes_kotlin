KOTLINC=kotlinc


.SUFFIXES: .jar .kt

all: programa_1_tam_tipos_basicos.jar

.kt.jar:
	$(KOTLINC) $^ -include-runtime -d $@ -jdk-home /home/usuario/jdk

clean:
	rm *.jar
