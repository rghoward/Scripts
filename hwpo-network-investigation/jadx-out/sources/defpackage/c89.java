package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class c89<T> extends l2<T> {
    public final sd1 a;
    public final List<? extends Annotation> b;
    public final ss5 c = hv5.c(j26.t, new o07(1, this));
    public final Map<wn5<? extends T>, KSerializer<? extends T>> d;
    public final LinkedHashMap e;

    public c89(sd1 sd1Var, wn5[] wn5VarArr, KSerializer[] kSerializerArr, Annotation[] annotationArr) {
        this.a = sd1Var;
        this.b = hf3.t;
        if (wn5VarArr.length != kSerializerArr.length) {
            z.b(sd1Var.c(), " should be marked @Serializable", "All subclasses of sealed class ");
            throw null;
        }
        int iMin = Math.min(wn5VarArr.length, kSerializerArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(new js7(wn5VarArr[i], kSerializerArr[i]));
        }
        Map<wn5<? extends T>, KSerializer<? extends T>> mapK = qi6.k(arrayList);
        this.d = mapK;
        Set<Map.Entry<wn5<? extends T>, KSerializer<? extends T>>> setEntrySet = mapK.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strA = ((KSerializer) entry.getValue()).getDescriptor().a();
            Object obj = linkedHashMap.get(strA);
            if (obj == null) {
                linkedHashMap.containsKey(strA);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                StringBuilder sb = new StringBuilder("Multiple sealed subclasses of '");
                sb.append(this.a);
                sb.append("' have the same serial name '");
                sb.append(strA);
                sb.append("': '");
                sb.append(entry2.getKey());
                Object key = entry.getKey();
                sb.append("', '");
                sb.append(key);
                sb.append('\'');
                throw new IllegalStateException(sb.toString().toString());
            }
            linkedHashMap.put(strA, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(pi6.g(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.e = linkedHashMap2;
        List<? extends Annotation> listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.b = listAsList;
    }

    @Override // defpackage.l2
    public final sy2<T> a(rt1 rt1Var, String str) {
        KSerializer kSerializer = (KSerializer) this.e.get(str);
        return kSerializer != null ? kSerializer : rt1Var.k().O0(c(), str);
    }

    @Override // defpackage.l2
    public final ud9<T> b(Encoder encoder, T t) {
        t.getClass();
        KSerializer<? extends T> kSerializer = this.d.get(ll8.a(t.getClass()));
        KSerializer<? extends T> kSerializerB = kSerializer != null ? kSerializer : super.b(encoder, t);
        if (kSerializerB != null) {
            return kSerializerB;
        }
        return null;
    }

    @Override // defpackage.l2
    public final wn5<T> c() {
        return this.a;
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.c.getValue();
    }
}
