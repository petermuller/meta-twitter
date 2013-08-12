DESCRIPTION = "python-oauth2 support"
LICENSE = "MIT"
SECTION = "console/tools"
PR = "r0"

LIC_FILES_CHKSUM="file://LICENSE.txt;md5=8dc983d0d3d6a7652aabdb4a27b96b28"

SRC_URI="https://github.com/simplegeo/python-oauth2"
SRCREV_default_python-oauth2 ?= "a83f4a297336b631e75cba102910c19231518159"

DEPENDS = "python"
RDEPENDS = "python"

do_compile() {
	python setup.py build
}

do_install() {
	python setup.py install
}
