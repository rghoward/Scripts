package defpackage;

import defpackage.e0c;
import defpackage.f0c;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0c<MessageType extends f0c<MessageType, BuilderType>, BuilderType extends e0c<MessageType, BuilderType>> implements g3c {
    protected transient int zza = 0;

    public static void i(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof p2c) {
            List listA = ((p2c) iterable).a();
            p2c p2cVar = (p2c) list;
            int size = list.size();
            for (Object obj : listA) {
                if (obj == null) {
                    int size2 = p2cVar.size() - size;
                    StringBuilder sb = new StringBuilder(String.valueOf(size2).length() + 26);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    String string = sb.toString();
                    int size3 = p2cVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            ac4.c(string);
                            return;
                        }
                        p2cVar.remove(size3);
                    }
                } else if (obj instanceof p0c) {
                    p2cVar.b();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    p0c.n(bArr, 0, bArr.length);
                    p2cVar.b();
                } else {
                    p2cVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof p3c) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof r3c) {
                r3c r3cVar = (r3c) list;
                int i = r3cVar.v + size4;
                int length = r3cVar.u.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = rh.a(length, 3, 2, 1, 10);
                        }
                        r3cVar.u = Arrays.copyOf(r3cVar.u, length);
                    } else {
                        r3cVar.u = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    e0c.g(size5, list);
                    throw null;
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size6 = list2.size();
        for (int i2 = 0; i2 < size6; i2++) {
            Object obj3 = list2.get(i2);
            if (obj3 == null) {
                e0c.g(size5, list);
                throw null;
            }
            list.add(obj3);
        }
    }

    @Override // defpackage.g3c
    public final void e(OutputStream outputStream) {
        u1c u1cVar = (u1c) this;
        int iF = u1cVar.f();
        boolean z = b1c.b;
        if (iF > 4096) {
            iF = 4096;
        }
        w0c w0cVar = new w0c(outputStream, iF);
        u1cVar.b(w0cVar);
        if (w0cVar.e > 0) {
            w0cVar.G();
        }
    }

    public final byte[] g() {
        try {
            u1c u1cVar = (u1c) this;
            int iF = u1cVar.f();
            byte[] bArr = new byte[iF];
            boolean z = b1c.b;
            u0c u0cVar = new u0c(bArr, iF);
            u1cVar.b(u0cVar);
            u0cVar.d();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            jl.a(w27.a(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public int h(t3c t3cVar) {
        throw null;
    }
}
