package defpackage;

import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class di6<Key, Value, Collection, Builder extends Map<Key, Value>> extends t0<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {
    public final KSerializer<Key> a;
    public final KSerializer<Value> b;

    public di6(KSerializer kSerializer, KSerializer kSerializer2) {
        this.a = kSerializer;
        this.b = kSerializer2;
    }

    @Override // defpackage.t0
    public final void f(rt1 rt1Var, int i, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        KSerializer<Key> kSerializer = this.a;
        s86 s86Var = ((t86) this).c;
        Object objJ = rt1Var.J(s86Var, i, kSerializer, null);
        int iG0 = rt1Var.g0(s86Var);
        if (iG0 != i + 1) {
            ca0.a(u.a(i, iG0, "Value must follow key in a map, index for key: ", ", returned index for value: "));
            return;
        }
        boolean zContainsKey = map.containsKey(objJ);
        KSerializer<Value> kSerializer2 = this.b;
        map.put(objJ, (!zContainsKey || (kSerializer2.getDescriptor().e() instanceof j98)) ? rt1Var.J(s86Var, iG0, kSerializer2, null) : rt1Var.J(s86Var, iG0, kSerializer2, qi6.h(objJ, map)));
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, Collection collection) {
        d(collection);
        s86 s86Var = ((t86) this).c;
        st1 st1VarW = encoder.w(s86Var);
        Iterator<Map.Entry<? extends Key, ? extends Value>> itC = c(collection);
        int i = 0;
        while (itC.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itC.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i2 = i + 1;
            st1VarW.q(s86Var, i, this.a, key);
            i += 2;
            st1VarW.q(s86Var, i2, this.b, value);
        }
        st1VarW.i(s86Var);
    }
}
