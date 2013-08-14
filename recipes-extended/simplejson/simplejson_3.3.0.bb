DESCRIPTION = "simplejson support"
LICENSE = "MIT"
SECTION = "console/tools"
PR = "r0"

LIC_FILES_CHKSUM="file://LICENSE.txt;md5=c6338d7abd321c0b50a2a547e441c52e"

SRC_URI="https://pypi.python.org/packages/source/s/simplejson/${P}.tar.gz"
SRC_URI[md5sum]="0e29b393bceac8081fa4e93ff9f6a001"
SRC_URI[sha256sum]="7a8a6bd82e111976aeb06138316ab10847adf612925072eaff8512228bcf9a1f"

DEPENDS = "python"
RDEPENDS_simplejson = "python"

do_compile() {
	python setup.py build
}

do_install() {
	python setup.py install
}
