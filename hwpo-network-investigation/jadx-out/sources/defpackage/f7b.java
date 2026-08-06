package defpackage;

import com.intercom.twig.BuildConfig;
import java.nio.ByteBuffer;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f7b {
    public final e7b a;
    public ByteBuffer b;
    public int c;
    public short d;
    public short e;

    public f7b(e7b e7bVar, short s) {
        int i;
        this.c = -1;
        yd6 yd6Var = e7b.A;
        byte[] bArr = e7bVar.u;
        byte[] bArr2 = e7bVar.x;
        byte[] bArr3 = e7bVar.v;
        byte[] bArr4 = e7bVar.t;
        int i2 = s + 4;
        boolean[] zArr = new boolean[259];
        for (int i3 = 0; i3 < i2; i3++) {
            zArr[i3] = false;
        }
        boolean z = true;
        for (int i4 = 0; i4 < 256; i4++) {
            z = e7b.a(i4, (short) (bArr[i4] & MessagePack.Code.EXT_TIMESTAMP), (short) (e7bVar.w[i4] & MessagePack.Code.EXT_TIMESTAMP), (short) (e7bVar.y[i4] & MessagePack.Code.EXT_TIMESTAMP), s, "second") && (e7b.a(i4, (short) (bArr4[i4] & MessagePack.Code.EXT_TIMESTAMP), (short) (bArr3[i4] & MessagePack.Code.EXT_TIMESTAMP), (short) (bArr2[i4] & MessagePack.Code.EXT_TIMESTAMP), s, "first") && z);
            if (bArr3[i4] == 0 && bArr[i4] == 0 && (i = (bArr4[i4] & MessagePack.Code.EXT_TIMESTAMP) + (bArr2[i4] & MessagePack.Code.EXT_TIMESTAMP)) < i2) {
                zArr[i] = true;
            }
        }
        int i5 = 0;
        while (i5 < i2) {
            if (i5 != 0 && !zArr[i5]) {
                if (i5 >= 3) {
                    yd6Var.a(Integer.valueOf(i5 - 3), "VCDiff: Bad code table; there is no opcode for inst COPY, size 0, mode {}");
                } else {
                    yd6Var.a(i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? BuildConfig.FLAVOR : "COPY" : "RUN" : "ADD" : "NOOP", "VCDiff: Bad code table; there is no opcode for inst {}, size -,  mode 0");
                }
                z = false;
            }
            i5++;
        }
        if (!z) {
            z90.a("Invalid code table data.");
            throw null;
        }
        this.a = e7bVar;
    }

    public final void a() {
        int i = this.c;
        if (i >= 0) {
            if (i > this.b.position()) {
                aa0.c("Internal error: last_instruction_start past end of instructions_and_sizes in unGetInstruction");
                return;
            }
            this.b.position(this.c);
            if (this.d == 256 || this.e == 256) {
                this.d = this.e;
            } else {
                aa0.c("Internal error: two pending instructions in a row in unGetInstruction");
            }
        }
    }

    public f7b() {
        this.c = -1;
        this.a = e7b.B;
    }
}
