all:
	cd source ; cd cap1_sintaxis_basica ; cd programas ;\
	make clean; make ; cd .. ; cd .. ; \
    cd cap2_fundamentos ; cd programas ; \
    make clean; make ; cd .. ; cd .. ; 
