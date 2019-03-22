all:
	cd source ; \
    cd cap1_sintaxis_basica ; \
    cd programas ; make ; cd .. ;cd ..;  \
    cd cap2_fundamentos ; \
    cd programas ;  make ; cd .. ;  \
    cd ejemplos;  make ; cd ..; cd ..; cd ..;\
    make html
