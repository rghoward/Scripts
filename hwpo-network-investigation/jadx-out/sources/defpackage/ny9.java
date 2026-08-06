package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ny9 extends oy9.b {
    public final /* synthetic */ oy9.a A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny9(oy9.a aVar, oy9 oy9Var, CharSequence charSequence) {
        super(oy9Var, charSequence);
        this.A = aVar;
    }

    @Override // oy9.b
    public final int a(int i) {
        return this.A.a.length() + i;
    }

    @Override // oy9.b
    public final int b(int i) {
        String str = this.A.a;
        int length = str.length();
        CharSequence charSequence = this.v;
        int length2 = charSequence.length() - length;
        while (i <= length2) {
            for (int i2 = 0; i2 < length; i2++) {
                if (charSequence.charAt(i2 + i) != str.charAt(i2)) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }
}
