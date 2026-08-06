package defpackage;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ws {
    public final XmlPullParser a;
    public int b = 0;
    public final lu7 c;

    public ws(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
        lu7 lu7Var = new lu7();
        lu7Var.a = new float[64];
        this.c = lu7Var;
    }

    public final float a(TypedArray typedArray, String str, int i, float f) {
        if (iza.c(this.a, str)) {
            f = typedArray.getFloat(i, f);
        }
        b(typedArray.getChangingConfigurations());
        return f;
    }

    public final void b(int i) {
        this.b = i | this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws)) {
            return false;
        }
        ws wsVar = (ws) obj;
        return xj5.a(this.a, wsVar.a) && this.b == wsVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.a);
        sb.append(", config=");
        return e44.a(sb, this.b, ')');
    }
}
