KOTLINC=kotlinc


.SUFFIXES: .jar .kt

all: ejemplo_vectores.jar

.kt.jar:
	$(KOTLINC) $^ -include-runtime -d $@

clean:
	rm *.jar
