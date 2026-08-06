package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xm5 implements mh4 {
    public final /* synthetic */ SerialDescriptor t;
    public final /* synthetic */ sl5 u;

    public /* synthetic */ xm5(sl5 sl5Var, SerialDescriptor serialDescriptor) {
        this.t = serialDescriptor;
        this.u = sl5Var;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        sl5 sl5Var = this.u;
        xl5 xl5Var = sl5Var.a;
        SerialDescriptor serialDescriptor = this.t;
        ym5.d(sl5Var, serialDescriptor);
        int iF = serialDescriptor.f();
        for (int i = 0; i < iF; i++) {
            List<Annotation> listH = serialDescriptor.h(i);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listH) {
                if (obj instanceof wm5) {
                    arrayList.add(obj);
                }
            }
            wm5 wm5Var = (wm5) (arrayList.size() == 1 ? arrayList.get(0) : null);
            if (wm5Var != null && (strArrNames = wm5Var.names()) != null) {
                for (String str : strArrNames) {
                    String str2 = xj5.a(serialDescriptor.e(), pd9.b.a) ? "enum value" : "property";
                    if (linkedHashMap.containsKey(str)) {
                        throw new gm5(ha7.d("The suggested name '" + str + "' for " + str2 + ' ' + serialDescriptor.g(i) + " is already one of the names for " + str2 + ' ' + serialDescriptor.g(((Number) qi6.h(str, linkedHashMap)).intValue()) + " in " + serialDescriptor, null, null, null, -1));
                    }
                    linkedHashMap.put(str, Integer.valueOf(i));
                }
            }
        }
        return linkedHashMap.isEmpty() ? if3.t : linkedHashMap;
    }
}
