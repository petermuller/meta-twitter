DESCRIPTION = "python-twitter support"
LICENSE = "Apache"
SECTION = "console/tools"
PR = "r0"

LIC_FILES_CHKSUM="file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI="https://python-twitter.googlecode.com/files/${P}.tar.gz"
SRC_URI[md5sum]="16abdc5ba30e43241981d3dd7eeef767"
SRC_URI[sha256sum]="e54e730bc40b969f35ed6ddfb310eac7256a2caac335a8971a46ae56beb7c814"

DEPENDS = "python"
RDEPENDS_python-twitter = "python httplib2 python-oauth2 simplejson"

do_compile() {
	python setup.py build
}

do_install() {
	python setup.py install
}
