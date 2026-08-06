package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pob implements h99 {
    public final CharSequence t;
    public final oob u;

    public pob(CharSequence charSequence, oob oobVar) {
        this.t = charSequence;
        this.u = oobVar;
    }

    @Override // defpackage.h99
    public final int W(int i) {
        CharSequence charSequence;
        do {
            i = this.u.h(i);
            if (i != -1) {
                charSequence = this.t;
                if (i == charSequence.length()) {
                }
            }
            return -1;
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.h99
    public final int X(int i) {
        do {
            i = this.u.i(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.t.charAt(i - 1)));
        return i;
    }

    @Override // defpackage.h99
    public final int i0(int i) {
        do {
            i = this.u.i(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.t.charAt(i)));
        return i;
    }

    @Override // defpackage.h99
    public final int j0(int i) {
        do {
            i = this.u.h(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.t.charAt(i - 1)));
        return i;
    }
}
