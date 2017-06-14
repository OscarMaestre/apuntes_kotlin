KOTLINC=kotlinc


.SUFFIXES: .jar .kt

all: ejemplo_when.jar

.kt.jar:
	$(KOTLINC) $^ -include-runtime -d $@

clean:
	rm *.jar
