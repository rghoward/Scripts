package defpackage;

import android.graphics.DashPathEffect;
import com.intercom.twig.BuildConfig;
import java.text.DecimalFormat;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bh0 extends jq1 {
    public nab g;
    public int m;
    public int n;
    public final ArrayList w;
    public int h = -7829368;
    public float i = 1.0f;
    public final int j = -7829368;
    public final float k = 1.0f;
    public float[] l = new float[0];
    public int o = 6;
    public final float p = 1.0f;
    public boolean q = false;
    public boolean r = false;
    public boolean s = true;
    public boolean t = true;
    public boolean u = true;
    public DashPathEffect v = null;
    public final boolean x = true;
    public float y = 0.0f;
    public float z = 0.0f;
    public boolean A = false;
    public boolean B = false;
    public float C = 0.0f;
    public float D = 0.0f;
    public float E = 0.0f;

    public bh0() {
        this.e = t6b.c(10.0f);
        this.b = t6b.c(5.0f);
        this.c = t6b.c(5.0f);
        this.w = new ArrayList();
    }

    public void a(float f, float f2) {
        float f3 = this.A ? this.D : f - this.y;
        float f4 = this.B ? this.C : f2 + this.z;
        if (Math.abs(f4 - f3) == 0.0f) {
            f4 += 1.0f;
            f3 -= 1.0f;
        }
        this.D = f3;
        this.C = f4;
        this.E = Math.abs(f4 - f3);
    }

    public final String b(int i) {
        return (i < 0 || i >= this.l.length) ? BuildConfig.FLAVOR : d().a(this.l[i]);
    }

    public final String c() {
        String str = BuildConfig.FLAVOR;
        for (int i = 0; i < this.l.length; i++) {
            String strB = b(i);
            if (strB != null && str.length() < strB.length()) {
                str = strB;
            }
        }
        return str;
    }

    public final nab d() {
        nab nabVar = this.g;
        if (nabVar == null || ((nabVar instanceof fq2) && ((fq2) nabVar).b != this.n)) {
            int i = this.n;
            fq2 fq2Var = new fq2();
            fq2Var.b = i;
            StringBuffer stringBuffer = new StringBuffer();
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 == 0) {
                    stringBuffer.append(".");
                }
                stringBuffer.append("0");
            }
            fq2Var.a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
            this.g = fq2Var;
        }
        return this.g;
    }
}
