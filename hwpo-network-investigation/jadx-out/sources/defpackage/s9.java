package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s9 extends o9<String[], Map<String, Boolean>> {
    @Override // defpackage.o9
    public final Intent createIntent(Context context, String[] strArr) {
        String[] strArr2 = strArr;
        context.getClass();
        strArr2.getClass();
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr2);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // defpackage.o9
    public final o9.a<Map<String, Boolean>> getSynchronousResult(Context context, String[] strArr) {
        String[] strArr2 = strArr;
        context.getClass();
        strArr2.getClass();
        if (strArr2.length == 0) {
            return new o9.a<>(if3.t);
        }
        for (String str : strArr2) {
            if (vz1.a(context, str) != 0) {
                return null;
            }
        }
        int iG = pi6.g(strArr2.length);
        if (iG < 16) {
            iG = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
        for (String str2 : strArr2) {
            linkedHashMap.put(str2, Boolean.TRUE);
        }
        return new o9.a<>(linkedHashMap);
    }

    @Override // defpackage.o9
    public final Map<String, Boolean> parseResult(int i, Intent intent) {
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                ArrayList arrayListV = u30.v(stringArrayExtra);
                Iterator it = arrayListV.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(ph1.n(arrayListV, 10), ph1.n(arrayList, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new js7(it.next(), it2.next()));
                }
                return qi6.k(arrayList2);
            }
        }
        return if3.t;
    }
}
