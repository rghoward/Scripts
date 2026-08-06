package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q10 extends ln4 {
    @Override // defpackage.ln4
    public final su6 C0(xu6 xu6Var, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            ot7 ot7Var = new ot7(byteBuffer.array(), byteBuffer.limit());
            ot7Var.o(12);
            int iD = (ot7Var.d() + ot7Var.g(12)) - 4;
            ot7Var.o(44);
            ot7Var.p(ot7Var.g(12));
            ot7Var.o(16);
            ArrayList arrayList = new ArrayList();
            while (ot7Var.d() < iD) {
                ot7Var.o(48);
                int iG = ot7Var.g(8);
                ot7Var.o(4);
                int iD2 = ot7Var.d() + ot7Var.g(12);
                String str = null;
                String str2 = null;
                while (ot7Var.d() < iD2) {
                    int iG2 = ot7Var.g(8);
                    int iG3 = ot7Var.g(8);
                    int iD3 = ot7Var.d() + iG3;
                    if (iG2 == 2) {
                        int iG4 = ot7Var.g(16);
                        ot7Var.o(8);
                        if (iG4 == 3) {
                            while (ot7Var.d() < iD3) {
                                int iG5 = ot7Var.g(8);
                                Charset charset = StandardCharsets.US_ASCII;
                                byte[] bArr = new byte[iG5];
                                ot7Var.j(bArr, iG5);
                                str = new String(bArr, charset);
                                int iG6 = ot7Var.g(8);
                                for (int i = 0; i < iG6; i++) {
                                    ot7Var.p(ot7Var.g(8));
                                }
                            }
                        }
                    } else if (iG2 == 21) {
                        Charset charset2 = StandardCharsets.US_ASCII;
                        byte[] bArr2 = new byte[iG3];
                        ot7Var.j(bArr2, iG3);
                        str2 = new String(bArr2, charset2);
                    }
                    ot7Var.m(iD3 * 8);
                }
                ot7Var.m(iD2 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new p10(iG, str.concat(str2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new su6(arrayList);
            }
        }
        return null;
    }
}
