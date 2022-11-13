rwildcard=$(foreach d,$(wildcard $(1:=/*)),$(call rwildcard,$d,$2) $(filter $(subst *,%,$2),$d))

SRC = $(call rwildcard,src,*.kt)
GRADLE_GEN_H_PATH = build/bin/native/debugShared
MAKE_GEN_H_PATH = build/h
GRADLE_PATH = ../../../gradlew
H_NAME = libKudoaLexer_api.h

$(MAKE_GEN_H_PATH)/$(H_NAME): $(GRADLE_GEN_H_PATH)/$(H_NAME) $(MAKE_GEN_H_PATH)
	mv $(GRADLE_GEN_H_PATH)/$(H_NAME) $(MAKE_GEN_H_PATH)

$(GRADLE_GEN_H_PATH)/$(H_NAME): $(SRC)
	$(GRADLE_PATH) build -b ./build.gradle.kts

$(MAKE_GEN_H_PATH):
	mkdir $@

clean:
	-rm -rf build