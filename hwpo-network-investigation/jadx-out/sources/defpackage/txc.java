package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class txc {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final ConcurrentHashMap b;
    public final ConcurrentHashMap c;

    public txc() {
        new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:57:0x0047 A[EDGE_INSN: B:57:0x0047->B:55:0x0047 BREAK  A[LOOP:1: B:25:0x0067->B:60:?], SYNTHETIC] */
    public final void a(p0c p0cVar, Set set, String str) {
        qxc[] qxcVarArr;
        if (!set.isEmpty() && !this.a.getAndSet(true)) {
            if (oac.b == null) {
                synchronized (oac.class) {
                    try {
                        if (oac.b == null) {
                            oac.b = new oac();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            oac.b.a.add(0, new oxc());
        }
        final byte[] bArrP = p0cVar.p();
        this.b.compute(str, new BiFunction() { // from class: mxc
            @Override // java.util.function.BiFunction
            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                byte[] bArr = (byte[]) obj2;
                byte[] bArr2 = bArrP;
                return Arrays.equals(bArr, bArr2) ? bArr : bArr2;
            }
        });
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AtomicReference atomicReference = (AtomicReference) this.c.putIfAbsent((String) it.next(), new AtomicReference(new qxc(str, bArrP)));
            if (atomicReference != null) {
                while (true) {
                    Object obj = atomicReference.get();
                    if (obj instanceof qxc) {
                        qxc qxcVar = (qxc) obj;
                        if (str.equals(qxcVar.t)) {
                            qxcVar.a(bArrP);
                            break;
                        }
                        qxc qxcVar2 = new qxc(str, bArrP);
                        qxcVarArr = str.compareTo(qxcVar.t) < 0 ? new qxc[]{qxcVar2, qxcVar} : new qxc[]{qxcVar, qxcVar2};
                        do {
                            if (atomicReference.compareAndSet(obj, qxcVarArr)) {
                                break;
                            }
                        } while (atomicReference.get() == obj);
                    } else {
                        qxc[] qxcVarArr2 = (qxc[]) obj;
                        int iBinarySearch = Arrays.binarySearch(qxcVarArr2, str);
                        if (iBinarySearch >= 0) {
                            qxcVarArr2[iBinarySearch].a(bArrP);
                            break;
                        }
                        int i = ~iBinarySearch;
                        int length = qxcVarArr2.length;
                        int i2 = length + 1;
                        int i3 = length - i;
                        if (i3 == 0) {
                            qxcVarArr = (qxc[]) Arrays.copyOf(qxcVarArr2, i2);
                        } else {
                            qxc[] qxcVarArr3 = new qxc[i2];
                            System.arraycopy(qxcVarArr2, 0, qxcVarArr3, 0, i);
                            System.arraycopy(qxcVarArr2, i, qxcVarArr3, i + 1, i3);
                            qxcVarArr = qxcVarArr3;
                        }
                        qxcVarArr[i] = new qxc(str, bArrP);
                        do {
                            if (atomicReference.compareAndSet(obj, qxcVarArr)) {
                                break;
                                break;
                            }
                        } while (atomicReference.get() == obj);
                    }
                }
            }
        }
    }
}
