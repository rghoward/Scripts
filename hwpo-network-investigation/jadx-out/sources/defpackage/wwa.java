package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wwa {
    public final View b;
    public final HashMap a = new HashMap();
    public final ArrayList<wva> c = new ArrayList<>();

    public wwa(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wwa)) {
            return false;
        }
        wwa wwaVar = (wwa) obj;
        return this.b == wwaVar.b && this.a.equals(wwaVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbB = tn2.b("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbB.append(this.b);
        sbB.append("\n");
        String strConcat = sbB.toString().concat("    values:");
        HashMap map = this.a;
        for (String str : map.keySet()) {
            strConcat = strConcat + "    " + str + ": " + map.get(str) + "\n";
        }
        return strConcat;
    }

    @Deprecated
    public wwa() {
    }
}
