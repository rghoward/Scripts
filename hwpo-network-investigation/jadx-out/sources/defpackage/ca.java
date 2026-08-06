package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ca extends w9<Object> {
    public final /* synthetic */ ba a;
    public final /* synthetic */ String b;
    public final /* synthetic */ o9<Object, Object> c;

    public ca(ba baVar, String str, o9<Object, Object> o9Var) {
        this.a = baVar;
        this.b = str;
        this.c = o9Var;
    }

    @Override // defpackage.w9
    public final void a(Object obj) throws Exception {
        ba baVar = this.a;
        ArrayList arrayList = baVar.d;
        LinkedHashMap linkedHashMap = baVar.b;
        String str = this.b;
        Object obj2 = linkedHashMap.get(str);
        o9<Object, Object> o9Var = this.c;
        if (obj2 == null) {
            y37.a("Attempting to launch an unregistered ActivityResultLauncher with contract ", o9Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            return;
        }
        int iIntValue = ((Number) obj2).intValue();
        arrayList.add(str);
        try {
            baVar.b(iIntValue, o9Var, obj);
        } catch (Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }
}
