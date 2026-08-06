package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z63 implements jac {
    public static final /* synthetic */ z63 t = new z63();

    public static final void b(SpannableStringBuilder spannableStringBuilder, String str) {
        str.getClass();
        int iU = z2a.u(spannableStringBuilder, str, 0, true, 2);
        spannableStringBuilder.setSpan(new StyleSpan(1), iU, str.length() + iU, 33);
    }

    public static final ox6 c(ox6 ox6Var, oh4 oh4Var) {
        return ox6Var.H(new s63(oh4Var));
    }

    public static final ox6 d(ox6 ox6Var, oh4 oh4Var) {
        return ox6Var.H(new g73(oh4Var));
    }

    public static final ox6 e(ox6 ox6Var, oh4 oh4Var) {
        return ox6Var.H(new h73(oh4Var));
    }

    public static final boolean f(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final ArrayList g(Map map, oh4 oh4Var) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            p47 p47Var = (p47) entry.getValue();
            Boolean boolValueOf = p47Var != null ? Boolean.valueOf(p47Var.b) : null;
            boolValueOf.getClass();
            if (!boolValueOf.booleanValue() && !p47Var.c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) oh4Var.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Integer.valueOf((int) u4c.u.get().Z());
    }
}
