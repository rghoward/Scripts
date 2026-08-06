package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xza {
    public final Object a;
    public final Object b;

    public xza() {
        this.a = new rd7();
        this.b = new nf6(16);
    }

    public vxc a(int i, String str, boolean z) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.a;
        vxc vxcVar = (vxc) atomicReferenceArray.get(i);
        if (vxcVar != null) {
            return vxcVar;
        }
        rwc rwcVarA = ((jxc) this.b).a(str, z);
        while (!atomicReferenceArray.compareAndSet(i, null, rwcVarA)) {
            if (atomicReferenceArray.get(i) != null) {
                vxc vxcVar2 = (vxc) atomicReferenceArray.get(i);
                vxcVar2.getClass();
                return vxcVar2;
            }
        }
        return rwcVarA;
    }

    public vxc b(int i, long j, String str) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.a;
        vxc vxcVar = (vxc) atomicReferenceArray.get(i);
        if (vxcVar != null) {
            return vxcVar;
        }
        bxc bxcVar = new bxc(str, ((jxc) this.b).a, j);
        while (!atomicReferenceArray.compareAndSet(i, null, bxcVar)) {
            if (atomicReferenceArray.get(i) != null) {
                vxc vxcVar2 = (vxc) atomicReferenceArray.get(i);
                vxcVar2.getClass();
                return vxcVar2;
            }
        }
        return bxcVar;
    }

    public vxc c(int i, String str, String str2) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.a;
        vxc vxcVar = (vxc) atomicReferenceArray.get(i);
        if (vxcVar != null) {
            return vxcVar;
        }
        exc excVar = new exc(str, ((jxc) this.b).a, str2);
        while (!atomicReferenceArray.compareAndSet(i, null, excVar)) {
            if (atomicReferenceArray.get(i) != null) {
                vxc vxcVar2 = (vxc) atomicReferenceArray.get(i);
                vxcVar2.getClass();
                return vxcVar2;
            }
        }
        return excVar;
    }

    public xza(jxc jxcVar, int i) {
        this.b = jxcVar;
        this.a = new AtomicReferenceArray(i);
    }
}
