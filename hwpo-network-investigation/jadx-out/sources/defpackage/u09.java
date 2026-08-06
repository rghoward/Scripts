package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u09 implements b19.b {
    public final /* synthetic */ v09 a;

    @Override // b19.b
    public final Bundle a() {
        js7[] js7VarArr;
        v09 v09Var = this.a;
        for (Map.Entry entry : qi6.l(v09Var.d).entrySet()) {
            v09Var.a(((i37) entry.getValue()).getValue(), (String) entry.getKey());
        }
        for (Map.Entry entry2 : qi6.l(v09Var.b).entrySet()) {
            v09Var.a(((b19.b) entry2.getValue()).a(), (String) entry2.getKey());
        }
        LinkedHashMap linkedHashMap = v09Var.a;
        if (linkedHashMap.isEmpty()) {
            js7VarArr = new js7[0];
        } else {
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                arrayList.add(new js7((String) entry3.getKey(), entry3.getValue()));
            }
            js7VarArr = (js7[]) arrayList.toArray(new js7[0]);
        }
        return uy0.c((js7[]) Arrays.copyOf(js7VarArr, js7VarArr.length));
    }
}
