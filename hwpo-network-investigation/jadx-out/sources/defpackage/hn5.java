package defpackage;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class hn5 extends l1 {
    public int A;
    public boolean B;
    public final JsonObject y;
    public final SerialDescriptor z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn5(sl5 sl5Var, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor) {
        super(sl5Var, jsonObject, str);
        sl5Var.getClass();
        jsonObject.getClass();
        this.y = jsonObject;
        this.z = serialDescriptor;
    }

    @Override // defpackage.l1, kotlinx.serialization.encoding.Decoder
    public final boolean d0() {
        return !this.B && super.d0();
    }

    @Override // defpackage.rt1
    public int g0(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        while (this.A < serialDescriptor.f()) {
            int i = this.A;
            this.A = i + 1;
            String strO = o(serialDescriptor, i);
            strO.getClass();
            int i2 = this.A - 1;
            this.B = false;
            if (!v().containsKey(strO)) {
                boolean z = (this.v.a.d || serialDescriptor.j(i2) || !serialDescriptor.i(i2).c()) ? false : true;
                this.B = z;
                if (z) {
                }
            }
            this.x.getClass();
            return i2;
        }
        return -1;
    }

    @Override // defpackage.l1, defpackage.rt1
    public void i(SerialDescriptor serialDescriptor) {
        Set setB;
        serialDescriptor.getClass();
        sl5 sl5Var = this.v;
        if (ym5.c(sl5Var, serialDescriptor) || (serialDescriptor.e() instanceof p58)) {
            return;
        }
        ym5.d(sl5Var, serialDescriptor);
        if (this.x.g) {
            Set setB2 = g28.b(serialDescriptor);
            ry2 ry2Var = sl5Var.c;
            ry2Var.getClass();
            Map map = (Map) ry2Var.a.get(serialDescriptor);
            Object obj = map != null ? map.get(ym5.a) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set setKeySet = map2 != null ? map2.keySet() : null;
            if (setKeySet == null) {
                setKeySet = of3.t;
            }
            setB = wx7.b(setB2, setKeySet);
        } else {
            setB = g28.b(serialDescriptor);
        }
        for (String str : v().t.keySet()) {
            if (!setB.contains(str) && !xj5.a(str, this.w)) {
                throw new gm5(ha7.d(eca.a('\'', "Encountered an unknown key '", str), r(), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.", sl5Var.a.i ? ha7.h(v().toString(), -1).toString() : null, -1));
            }
        }
    }

    @Override // defpackage.l1, kotlinx.serialization.encoding.Decoder
    public final rt1 n(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        SerialDescriptor serialDescriptor2 = this.z;
        if (serialDescriptor != serialDescriptor2) {
            return super.n(serialDescriptor);
        }
        JsonElement jsonElementT = t();
        String strA = serialDescriptor2.a();
        boolean z = jsonElementT instanceof JsonObject;
        sl5 sl5Var = this.v;
        if (z) {
            return new hn5(sl5Var, (JsonObject) jsonElementT, this.w, serialDescriptor2);
        }
        throw new gm5(ha7.d("Expected " + ll8.a(JsonObject.class).c() + ", but had " + ll8.a(jsonElementT.getClass()).c() + " as the serialized body of " + strA, r(), null, sl5Var.a.i ? ha7.h(jsonElementT.toString(), -1).toString() : null, -1));
    }

    @Override // defpackage.j47
    public String o(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        sl5 sl5Var = this.v;
        ym5.d(sl5Var, serialDescriptor);
        String strG = serialDescriptor.g(i);
        if (this.x.g && !v().t.keySet().contains(strG)) {
            ry2 ry2Var = sl5Var.c;
            xm5 xm5Var = new xm5(sl5Var, serialDescriptor);
            ry2Var.getClass();
            ConcurrentHashMap concurrentHashMap = ry2Var.a;
            Map map = (Map) concurrentHashMap.get(serialDescriptor);
            Object obj = null;
            ry2.a<Map<String, Integer>> aVar = ym5.a;
            Object objInvoke = map != null ? map.get(aVar) : null;
            if (objInvoke == null) {
                objInvoke = null;
            }
            if (objInvoke == null) {
                objInvoke = xm5Var.invoke();
                Object concurrentHashMap2 = concurrentHashMap.get(serialDescriptor);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(serialDescriptor, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(aVar, objInvoke);
            }
            Map map2 = (Map) objInvoke;
            for (Object obj2 : v().t.keySet()) {
                Integer num = (Integer) map2.get((String) obj2);
                if (num != null && num.intValue() == i) {
                    obj = obj2;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return strG;
    }

    @Override // defpackage.l1
    public JsonElement s(String str) {
        str.getClass();
        return (JsonElement) qi6.h(str, v());
    }

    @Override // defpackage.l1
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public JsonObject v() {
        return this.y;
    }

    public /* synthetic */ hn5(sl5 sl5Var, JsonObject jsonObject, String str, int i) {
        this(sl5Var, jsonObject, (i & 4) != 0 ? null : str, (SerialDescriptor) null);
    }
}
