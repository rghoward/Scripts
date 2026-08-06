package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class il8<ElementKlass, Element extends ElementKlass> extends dh1<Element, Element[], ArrayList<Element>> {
    public final wn5<ElementKlass> b;
    public final g30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il8(wn5<ElementKlass> wn5Var, KSerializer<Element> kSerializer) {
        super(kSerializer);
        kSerializer.getClass();
        this.b = wn5Var;
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        descriptor.getClass();
        this.c = new g30(descriptor);
    }

    @Override // defpackage.t0
    public final Object a() {
        return new ArrayList();
    }

    @Override // defpackage.t0
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // defpackage.t0
    public final Iterator c(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return new i30(objArr);
    }

    @Override // defpackage.t0
    public final int d(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    @Override // defpackage.t0
    public final Object g(Object obj) {
        throw null;
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return this.c;
    }

    @Override // defpackage.t0
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        Object objNewInstance = Array.newInstance((Class<?>) me3.b(this.b), arrayList.size());
        objNewInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        array.getClass();
        return array;
    }

    @Override // defpackage.dh1
    public final void i(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
