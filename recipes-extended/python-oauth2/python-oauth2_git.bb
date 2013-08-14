DESCRIPTION = "python-oauth2 support"
LICENSE = "MIT"
SECTION = "console/tools"
PR = "r0"

LIC_FILES_CHKSUM="file://LICENSE.txt;md5=8dc983d0d3d6a7652aabdb4a27b96b28"

SRC_URI="https://github.com/simplegeo/python-oauth2"
SRCREV_default_python-oauth2 ?= "a83f4a297336b631e75cba102910c19231518159"

#SRC_URI[md5sum] = "657cde731efb45880b104274f1e69c8b"
#SRC_URI[sha256sum] = "29ec85c208f863ffec5ce54d2d5e1134083ef491ab039018bb73ff6118ff99db"
SRC_URI[md5sum] = "7a23688cf12c73b9873e532e743b3aca"
SRC_URI[sha256sum] = "954fc9b4ae99c8d1a02cd9e44e1c53f7cfb9f30ae0a4d4250405a272124e6366"

DEPENDS = "python"
RDEPENDS_python_oauth2 = "python"

S="${WORKDIR}/git-${PR}"

do_compile() {
	python setup.py build
}

do_install() {
	python setup.py install
}
