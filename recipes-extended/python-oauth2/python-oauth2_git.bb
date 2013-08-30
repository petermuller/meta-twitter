DESCRIPTION = "python-oauth2 support"
LICENSE = "MIT"
SECTION = "console/tools"
PR = "r4"

LIC_FILES_CHKSUM="file://LICENSE.txt;md5=8dc983d0d3d6a7652aabdb4a27b96b28"

SRC_URI="git://github.com/simplegeo/python-oauth2.git"
SRCREV_default_pn-python-oauth2="a83f4a297336b631e75cba102910c19231518159"

SRC_URI[md5sum] = "657cde731efb45880b104274f1e69c8b"
SRC_URI[sha256sum] = "29ec85c208f863ffec5ce54d2d5e1134083ef491ab039018bb73ff6118ff99db"

S="${WORKDIR}/git"

RDEPENDS_${PN} += "python"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

do_install_append() {
  rm -f ${D}${libdir}/python*/site-packages/site.py*
}
