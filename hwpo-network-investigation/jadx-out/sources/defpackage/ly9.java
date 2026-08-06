package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ly9 extends oy9.b {
    public final /* synthetic */ my9 A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly9(my9 my9Var, oy9 oy9Var, CharSequence charSequence) {
        super(oy9Var, charSequence);
        this.A = my9Var;
    }

    @Override // oy9.b
    public final int a(int i) {
        return i + 1;
    }

    @Override // oy9.b
    public final int b(int i) {
        pa1.b bVar = this.A.a;
        CharSequence charSequence = this.v;
        int length = charSequence.length();
        xl7.o(i, length);
        while (i < length) {
            if (bVar.a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
