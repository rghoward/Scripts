package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class xl5 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final boolean g;
    public final rd1 h;
    public final boolean i;

    public xl5(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, boolean z5, rd1 rd1Var, boolean z6) {
        str.getClass();
        str2.getClass();
        rd1Var.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
        this.f = str2;
        this.g = z5;
        this.h = rd1Var;
        this.i = z6;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=");
        sb.append(this.a);
        sb.append(", isLenient=");
        sb.append(this.b);
        sb.append(", allowStructuredMapKeys=");
        sb.append(this.c);
        sb.append(", prettyPrint=false, explicitNulls=");
        sb.append(this.d);
        sb.append(", prettyPrintIndent='");
        sb.append(this.e);
        sb.append("', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='");
        sb.append(this.f);
        sb.append("', allowSpecialFloatingPointValues=false, useAlternativeNames=");
        sb.append(this.g);
        sb.append(", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=");
        sb.append(this.h);
        sb.append(", exceptionsWithDebugInfo=");
        return pi1.a(sb, this.i, ')');
    }
}
