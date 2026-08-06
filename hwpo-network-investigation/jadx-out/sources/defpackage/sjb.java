package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sjb implements su6.a {
    public final String a;
    public final String b;

    public sjb(String str, String str2) {
        this.a = h40.g(str);
        this.b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // su6.a
    public final void b(np6.a aVar) {
        String str = this.a;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    b = 0;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    b = 1;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    b = 2;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    b = 3;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    b = 4;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b = 5;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b = 6;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    b = 7;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b = 8;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b = 9;
                }
                break;
        }
        String str2 = this.b;
        switch (b) {
            case 0:
                Integer numN1 = ek5.n1(str2);
                if (numN1 != null) {
                    aVar.i = numN1;
                }
                break;
            case 1:
                Integer numN2 = ek5.n1(str2);
                if (numN2 != null) {
                    aVar.v = numN2;
                }
                break;
            case 2:
                Integer numN3 = ek5.n1(str2);
                if (numN3 != null) {
                    aVar.h = numN3;
                }
                break;
            case 3:
                aVar.c = str2;
                break;
            case 4:
                aVar.w = str2;
                break;
            case 5:
                aVar.a = str2;
                break;
            case 6:
                aVar.e = str2;
                break;
            case 7:
                Integer numN4 = ek5.n1(str2);
                if (numN4 != null) {
                    aVar.u = numN4;
                }
                break;
            case 8:
                aVar.d = str2;
                break;
            case 9:
                aVar.b = str2;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sjb.class == obj.getClass()) {
            sjb sjbVar = (sjb) obj;
            if (this.a.equals(sjbVar.a) && this.b.equals(sjbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + ru3.c(527, 31, this.a);
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}
