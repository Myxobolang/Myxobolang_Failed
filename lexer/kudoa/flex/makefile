DPATH = build/debug
RPATH = build/release

ALL: $(DPATH)/kudoaLexer.a $(RPATH)/kudoaLexer.a

$(RPATH)/kudoaLexer.a: $(RPATH)/kudoaLexer.o $(RPATH)/kotlinWrapper.o
	ar -r $@ $^
$(RPATH)/kudoaLexer.o: build/c/lex.yy.c $(RPATH)
	clang -c $< -o $@
$(RPATH)/kotlinWrapper.o: kotlinWrapper.cpp kotlinWrapper.h $(RPATH)
	clang++ -c $< -o $@

$(DPATH)/kudoaLexer.a: $(DPATH)/kudoaLexer.o $(DPATH)/kotlinWrapper.o
	ar -r $@ $^
$(DPATH)/kudoaLexer.o: build/c/lex.yy.c $(DPATH)
	clang -c $< -o $@ -g
$(DPATH)/kotlinWrapper.o: kotlinWrapper.cpp kotlinWrapper.h $(DPATH)
	clang++ -c $< -o $@ -g

build/c/lex.yy.c: kudoa.l kudoaLexer.h build/c
	flex -o $@ $<

$(RPATH): build
	mkdir -p $@
build/c: build
	mkdir -p $@
$(DPATH): build
	mkdir -p $@
build:
	mkdir -p $@

clean:
	-rm -rf build