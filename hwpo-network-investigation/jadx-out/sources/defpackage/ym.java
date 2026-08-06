package defpackage;

import android.view.View;
import android.view.ViewParent;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ym implements jac {
    public static final /* synthetic */ ym t = new ym();

    public static final boolean b(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final float c(int i, int i2, float[] fArr, float[] fArr2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    public static String d(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static final v59 e(u59 u59Var, Integer num, Integer num2) {
        u59Var.getClass();
        if (num != null) {
            int iOrdinal = u59Var.ordinal();
            if (iOrdinal != 1) {
                return iOrdinal != 9 ? v59.x : v59.z;
            }
            return v59.y;
        }
        int iOrdinal2 = u59Var.ordinal();
        if (iOrdinal2 != 1) {
            return iOrdinal2 != 9 ? v59.t : v59.w;
        }
        return num2 != null ? v59.v : v59.u;
    }

    public static boolean f(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean g(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static final void h(float[] fArr, float[] fArr2) {
        float fC = c(0, 0, fArr2, fArr);
        float fC2 = c(0, 1, fArr2, fArr);
        float fC3 = c(0, 2, fArr2, fArr);
        float fC4 = c(0, 3, fArr2, fArr);
        float fC5 = c(1, 0, fArr2, fArr);
        float fC6 = c(1, 1, fArr2, fArr);
        float fC7 = c(1, 2, fArr2, fArr);
        float fC8 = c(1, 3, fArr2, fArr);
        float fC9 = c(2, 0, fArr2, fArr);
        float fC10 = c(2, 1, fArr2, fArr);
        float fC11 = c(2, 2, fArr2, fArr);
        float fC12 = c(2, 3, fArr2, fArr);
        float fC13 = c(3, 0, fArr2, fArr);
        float fC14 = c(3, 1, fArr2, fArr);
        float fC15 = c(3, 2, fArr2, fArr);
        float fC16 = c(3, 3, fArr2, fArr);
        fArr[0] = fC;
        fArr[1] = fC2;
        fArr[2] = fC3;
        fArr[3] = fC4;
        fArr[4] = fC5;
        fArr[5] = fC6;
        fArr[6] = fC7;
        fArr[7] = fC8;
        fArr[8] = fC9;
        fArr[9] = fC10;
        fArr[10] = fC11;
        fArr[11] = fC12;
        fArr[12] = fC13;
        fArr[13] = fC14;
        fArr[14] = fC15;
        fArr[15] = fC16;
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return ((l5c) k5c.u.t.t).b();
    }
}
