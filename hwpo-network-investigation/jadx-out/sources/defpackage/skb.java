package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class skb {
    public static void a(tx0.b bVar, byte[] bArr) {
        long j;
        bVar.getClass();
        bArr.getClass();
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = bVar.x;
            int i2 = bVar.y;
            int i3 = bVar.z;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = bVar.w;
            tx0 tx0Var = bVar.t;
            tx0Var.getClass();
            if (j2 == tx0Var.u) {
                aa0.c("no more bytes");
                return;
            }
            j = bVar.w;
        } while (bVar.k(j == -1 ? 0L : j + ((long) (bVar.z - bVar.y))) != -1);
    }
}
