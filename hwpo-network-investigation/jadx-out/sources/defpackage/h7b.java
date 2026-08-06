package defpackage;

import com.intercom.twig.BuildConfig;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h7b {
    public final j7b a;
    public boolean b;
    public ByteBuffer c;
    public ByteBuffer e;
    public ByteBuffer f;
    public ByteBuffer g;
    public int h;
    public Integer i;
    public int j;
    public boolean k;
    public final htb m;
    public f7b n;
    public final AtomicInteger d = new AtomicInteger(0);
    public final AtomicInteger l = new AtomicInteger(0);

    static {
        ae6.e(h7b.class);
    }

    public h7b(j7b j7bVar) {
        htb htbVar = new htb();
        htbVar.a = 0;
        this.m = htbVar;
        this.n = new f7b();
        this.a = j7bVar;
        b();
    }

    /* JADX WARN: Code duplicated, block: B:107:0x025d  */
    /* JADX WARN: Code duplicated, block: B:109:0x026e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0270  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:117:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:119:0x02da  */
    /* JADX WARN: Code duplicated, block: B:121:0x02de  */
    /* JADX WARN: Code duplicated, block: B:124:0x030f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0313  */
    /* JADX WARN: Code duplicated, block: B:126:0x0324  */
    /* JADX WARN: Code duplicated, block: B:128:0x032b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0335  */
    /* JADX WARN: Code duplicated, block: B:132:0x033f  */
    /* JADX WARN: Code duplicated, block: B:173:0x043f  */
    /* JADX WARN: Code duplicated, block: B:221:0x0561  */
    /* JADX WARN: Code duplicated, block: B:223:0x0564  */
    /* JADX WARN: Code duplicated, block: B:225:0x0567  */
    /* JADX WARN: Code duplicated, block: B:227:0x056a  */
    /* JADX WARN: Code duplicated, block: B:228:0x056d  */
    /* JADX WARN: Code duplicated, block: B:229:0x0570  */
    /* JADX WARN: Code duplicated, block: B:230:0x0573  */
    /* JADX WARN: Code duplicated, block: B:231:0x0576  */
    /* JADX WARN: Code duplicated, block: B:287:0x0594 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x019e  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:89:0x01de  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:96:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:98:0x0227  */
    public final int a(ByteBuffer byteBuffer) throws IOException {
        byte b;
        int i;
        byte b2;
        byte b3;
        byte b4;
        int i2;
        String str;
        i7b.a aVarC;
        Integer numB;
        j7b.a aVar;
        Integer numValueOf;
        IOException iOException;
        Integer num;
        i7b.b bVar;
        int iIntValue;
        int i3;
        int i4;
        int i5;
        int i6;
        int iA;
        short s;
        boolean z = this.b;
        AtomicInteger atomicInteger = this.l;
        AtomicInteger atomicInteger2 = this.d;
        j7b j7bVar = this.a;
        if (z) {
            atomicInteger2 = atomicInteger2;
            b = 2;
            if (!d()) {
                o03.a("Internal error: Resumed decoding of a delta file window when interleaved format is not being used");
                return 0;
            }
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            this.e = byteBufferSlice;
            int iRemaining = byteBufferSlice.remaining();
            int i7 = this.h;
            if (iRemaining > i7) {
                this.e.limit(i7);
            }
            ByteBuffer byteBuffer2 = this.e;
            this.f = byteBuffer2;
            this.g = byteBuffer2;
            f7b f7bVar = this.n;
            f7bVar.b = byteBuffer2;
            f7bVar.c = -1;
            f7bVar.e = f7bVar.d;
        } else {
            j7b.a aVar2 = j7bVar.c;
            i7b i7bVar = new i7b(byteBuffer.slice());
            int iLimit = j7bVar.a.limit();
            int size = aVar2.size();
            boolean z2 = j7bVar.p;
            Byte bA = i7bVar.a();
            if (bA == null) {
                aVarC = null;
            } else {
                int iByteValue = bA.byteValue() & 248;
                if (iByteValue != 0) {
                    i7b.f.c(String.format("Unrecognized win_indicator flags: 0x%02x", Integer.valueOf(iByteValue)));
                }
                int iByteValue2 = bA.byteValue() & 3;
                if (iByteValue2 == 1) {
                    aVarC = i7bVar.c(iLimit, bA.byteValue(), "end of dictionary", "dictionary");
                } else if (iByteValue2 != 2) {
                    if (iByteValue2 == 3) {
                        IOException iOException2 = new IOException("Win_Indicator must not have both VCD_SOURCE and VCD_TARGET set");
                        i7bVar.b = iOException2;
                        throw iOException2;
                    }
                    aVarC = new i7b.a(bA.byteValue(), 0, 0);
                } else {
                    if (!z2) {
                        IOException iOException3 = new IOException("Delta file contains VCD_TARGET flag, which is not allowed by current decoder settings");
                        i7bVar.b = iOException3;
                        throw iOException3;
                    }
                    aVarC = i7bVar.c(size, bA.byteValue(), "current target position", "target file");
                }
            }
            if (aVarC == null) {
                s = i7bVar.a;
            } else {
                int i8 = aVarC.c;
                byte b5 = aVarC.a;
                atomicInteger2.set(aVarC.b);
                this.k = j7bVar.d == 83 && (b5 & 4) != 0;
                if (i7bVar.e != null) {
                    IOException iOException4 = new IOException("Internal error: VCDiffHeaderParser.ParseWindowLengths was called twice for the same delta window");
                    i7bVar.b = iOException4;
                    throw iOException4;
                }
                Integer numB2 = i7bVar.b("length of the delta encoding");
                i7bVar.c = numB2;
                ByteBuffer byteBuffer3 = i7bVar.d;
                if (numB2 == null) {
                    numB = null;
                } else {
                    i7bVar.e = byteBuffer3.duplicate();
                    numB = i7bVar.b("size of the target window");
                }
                this.i = numB;
                if (numB == null) {
                    s = i7bVar.a;
                } else {
                    int iIntValue2 = numB.intValue();
                    int i9 = j7bVar.l;
                    if (iIntValue2 > i9) {
                        throw new IOException(String.format("Length of target window (%d) exceeds limit of %d bytes", numB, Integer.valueOf(i9)));
                    }
                    int i10 = j7bVar.j;
                    b = 2;
                    if (i10 != -3) {
                        long j = j7bVar.m;
                        if (iIntValue2 > ((long) i10) - j) {
                            throw new IOException(String.format("Length of target window (%d bytes) plus previous windows (%d bytes) would exceed planned size of %d bytes", numB, Long.valueOf(j), Integer.valueOf(j7bVar.j)));
                        }
                    }
                    long j2 = j7bVar.k;
                    long j3 = j7bVar.m;
                    if (iIntValue2 > j2 - j3) {
                        throw new IOException(String.format("Length of target window (%d bytes) plus previous windows (%d bytes) would exceed maximum target file size of %d bytes", numB, Long.valueOf(j3), Long.valueOf(j7bVar.k)));
                    }
                    Byte bA2 = i7bVar.a();
                    if (bA2 != null && (bA2.byteValue() & 7) != 0) {
                        IOException iOException5 = new IOException("Secondary compression of delta file sections is not supported");
                        i7bVar.b = iOException5;
                        throw iOException5;
                    }
                    boolean z3 = this.k;
                    Integer numB3 = i7bVar.b("length of data for ADDs and RUNs");
                    Integer numB4 = i7bVar.b("length of instructions section");
                    Integer numB5 = i7bVar.b("length of addresses for COPYs");
                    if (z3 && i7bVar.a == 0) {
                        IOException iOException6 = i7bVar.b;
                        if (iOException6 != null) {
                            throw iOException6;
                        }
                        try {
                            try {
                                byteBuffer3.mark();
                                aVar = aVar2;
                                try {
                                    long jC = kcb.c(byteBuffer3);
                                    if ((jC & (-4294967296L)) != 0) {
                                        byteBuffer3.reset();
                                        IOException iOException7 = new IOException("Value of {} ({}) is too large for unsigned 32-bit integer");
                                        i7bVar.b = iOException7;
                                        throw iOException7;
                                    }
                                    numValueOf = Integer.valueOf((int) jC);
                                    if (i7bVar.a != 0) {
                                        bVar = null;
                                    } else {
                                        iOException = i7bVar.b;
                                        if (iOException == null) {
                                            throw iOException;
                                        }
                                        if (i7bVar.e != null) {
                                            IOException iOException8 = new IOException("Internal error: VCDiffHeaderParser.parseSectionLengths was called before ParseWindowLengths");
                                            i7bVar.b = iOException8;
                                            throw iOException8;
                                        }
                                        num = numValueOf;
                                        if (i7bVar.c.intValue() == ((long) (byteBuffer3.position() - i7bVar.e.position())) + ((long) numB3.intValue()) + ((long) numB4.intValue()) + ((long) numB5.intValue())) {
                                            IOException iOException9 = new IOException("The length of the delta encoding does not match the size of the header plus the sizes of the data sections");
                                            i7bVar.b = iOException9;
                                            throw iOException9;
                                        }
                                        int iIntValue3 = numB3.intValue();
                                        int iIntValue4 = numB4.intValue();
                                        int iIntValue5 = numB5.intValue();
                                        if (num != null) {
                                            iIntValue = num.intValue();
                                        } else {
                                            iIntValue = 0;
                                        }
                                        bVar = new i7b.b(iIntValue3, iIntValue4, iIntValue5, iIntValue);
                                    }
                                    if (bVar == null) {
                                        s = i7bVar.a;
                                    } else {
                                        i3 = bVar.d;
                                        i4 = bVar.b;
                                        i5 = bVar.c;
                                        i6 = bVar.a;
                                        iA = kcb.a(i4) + kcb.a(i5) + kcb.a(i6) + kcb.a(this.i.intValue()) + 1 + i6 + i5 + i4;
                                        if (this.k) {
                                            atomicInteger.set(i3);
                                            iA += kcb.a(i3);
                                        }
                                        if (j7bVar.d != 83 && i6 == 0 && i5 == 0) {
                                            this.h = i4;
                                            ByteBuffer byteBufferSlice2 = byteBuffer3.duplicate().asReadOnlyBuffer().slice();
                                            this.e = byteBufferSlice2;
                                            int iRemaining2 = byteBufferSlice2.remaining();
                                            int i11 = this.h;
                                            if (iRemaining2 > i11) {
                                                this.e.limit(i11);
                                            }
                                            ByteBuffer byteBuffer4 = this.e;
                                            this.f = byteBuffer4;
                                            this.g = byteBuffer4;
                                        } else if (byteBuffer3.duplicate().asReadOnlyBuffer().remaining() < i6 + i4 + i5) {
                                            s = -2;
                                        } else {
                                            ByteBuffer byteBufferSlice3 = byteBuffer3.duplicate().asReadOnlyBuffer().slice();
                                            this.f = byteBufferSlice3;
                                            byteBufferSlice3.position(i6);
                                            ByteBuffer byteBufferSlice4 = this.f.slice();
                                            this.e = byteBufferSlice4;
                                            byteBufferSlice4.position(i4);
                                            ByteBuffer byteBufferSlice5 = this.e.slice();
                                            this.g = byteBufferSlice5;
                                            byteBufferSlice5.position(i5);
                                            this.f.flip();
                                            this.e.flip();
                                            this.g.flip();
                                            if (i7bVar.c.intValue() != iA) {
                                                o03.a("The end of the instructions section does not match the end of the delta window");
                                                return 0;
                                            }
                                        }
                                        f7b f7bVar2 = this.n;
                                        f7bVar2.b = this.e;
                                        f7bVar2.c = -1;
                                        f7bVar2.d = (short) 256;
                                        f7bVar2.e = (short) 256;
                                        s = 0;
                                    }
                                    if (s == 0) {
                                        if ((b5 & 1) != 0) {
                                            ByteBuffer byteBuffer5 = (ByteBuffer) j7bVar.a.duplicate().rewind();
                                            this.c = byteBuffer5;
                                            byteBuffer5.position(i8);
                                        } else if ((b5 & 2) != 0) {
                                            ByteBuffer byteBufferK = aVar.k();
                                            this.c = byteBufferK;
                                            byteBufferK.position(i8);
                                        }
                                        this.b = true;
                                        byteBuffer.position(byteBuffer3.duplicate().asReadOnlyBuffer().position() + byteBuffer.position());
                                        j7bVar.m += (long) this.i.intValue();
                                        s = 0;
                                    }
                                } catch (kcb.a unused) {
                                    i7bVar.a = (short) -2;
                                    byteBuffer3.reset();
                                    numValueOf = null;
                                }
                            } catch (kcb.b unused2) {
                                byteBuffer3.reset();
                                IOException iOException10 = new IOException("Expected {}; found invalid variable-length integer");
                                i7bVar.b = iOException10;
                                throw iOException10;
                            }
                        } catch (kcb.a unused3) {
                            aVar = aVar2;
                        }
                    } else {
                        aVar = aVar2;
                    }
                    numValueOf = null;
                    if (i7bVar.a != 0) {
                        bVar = null;
                    } else {
                        iOException = i7bVar.b;
                        if (iOException == null) {
                            throw iOException;
                        }
                        if (i7bVar.e != null) {
                            IOException iOException11 = new IOException("Internal error: VCDiffHeaderParser.parseSectionLengths was called before ParseWindowLengths");
                            i7bVar.b = iOException11;
                            throw iOException11;
                        }
                        num = numValueOf;
                        if (i7bVar.c.intValue() == ((long) (byteBuffer3.position() - i7bVar.e.position())) + ((long) numB3.intValue()) + ((long) numB4.intValue()) + ((long) numB5.intValue())) {
                            IOException iOException12 = new IOException("The length of the delta encoding does not match the size of the header plus the sizes of the data sections");
                            i7bVar.b = iOException12;
                            throw iOException12;
                        }
                        int iIntValue6 = numB3.intValue();
                        int iIntValue7 = numB4.intValue();
                        int iIntValue8 = numB5.intValue();
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        bVar = new i7b.b(iIntValue6, iIntValue7, iIntValue8, iIntValue);
                    }
                    if (bVar == null) {
                        s = i7bVar.a;
                    } else {
                        i3 = bVar.d;
                        i4 = bVar.b;
                        i5 = bVar.c;
                        i6 = bVar.a;
                        iA = kcb.a(i4) + kcb.a(i5) + kcb.a(i6) + kcb.a(this.i.intValue()) + 1 + i6 + i5 + i4;
                        if (this.k) {
                            atomicInteger.set(i3);
                            iA += kcb.a(i3);
                        }
                        if (j7bVar.d != 83) {
                            if (byteBuffer3.duplicate().asReadOnlyBuffer().remaining() < i6 + i4 + i5) {
                                s = -2;
                            } else {
                                ByteBuffer byteBufferSlice6 = byteBuffer3.duplicate().asReadOnlyBuffer().slice();
                                this.f = byteBufferSlice6;
                                byteBufferSlice6.position(i6);
                                ByteBuffer byteBufferSlice7 = this.f.slice();
                                this.e = byteBufferSlice7;
                                byteBufferSlice7.position(i4);
                                ByteBuffer byteBufferSlice8 = this.e.slice();
                                this.g = byteBufferSlice8;
                                byteBufferSlice8.position(i5);
                                this.f.flip();
                                this.e.flip();
                                this.g.flip();
                                if (i7bVar.c.intValue() != iA) {
                                    o03.a("The end of the instructions section does not match the end of the delta window");
                                    return 0;
                                }
                                f7b f7bVar3 = this.n;
                                f7bVar3.b = this.e;
                                f7bVar3.c = -1;
                                f7bVar3.d = (short) 256;
                                f7bVar3.e = (short) 256;
                                s = 0;
                            }
                        } else if (byteBuffer3.duplicate().asReadOnlyBuffer().remaining() < i6 + i4 + i5) {
                            s = -2;
                        } else {
                            ByteBuffer byteBufferSlice9 = byteBuffer3.duplicate().asReadOnlyBuffer().slice();
                            this.f = byteBufferSlice9;
                            byteBufferSlice9.position(i6);
                            ByteBuffer byteBufferSlice10 = this.f.slice();
                            this.e = byteBufferSlice10;
                            byteBufferSlice10.position(i4);
                            ByteBuffer byteBufferSlice11 = this.e.slice();
                            this.g = byteBufferSlice11;
                            byteBufferSlice11.position(i5);
                            this.f.flip();
                            this.e.flip();
                            this.g.flip();
                            if (i7bVar.c.intValue() != iA) {
                                o03.a("The end of the instructions section does not match the end of the delta window");
                                return 0;
                            }
                            f7b f7bVar4 = this.n;
                            f7bVar4.b = this.e;
                            f7bVar4.c = -1;
                            f7bVar4.d = (short) 256;
                            f7bVar4.e = (short) 256;
                            s = 0;
                        }
                    }
                    if (s == 0) {
                        if ((b5 & 1) != 0) {
                            ByteBuffer byteBuffer6 = (ByteBuffer) j7bVar.a.duplicate().rewind();
                            this.c = byteBuffer6;
                            byteBuffer6.position(i8);
                        } else if ((b5 & 2) != 0) {
                            ByteBuffer byteBufferK2 = aVar.k();
                            this.c = byteBufferK2;
                            byteBufferK2.position(i8);
                        }
                        this.b = true;
                        byteBuffer.position(byteBuffer3.duplicate().asReadOnlyBuffer().position() + byteBuffer.position());
                        j7bVar.m += (long) this.i.intValue();
                        s = 0;
                    }
                }
                if (s == -2) {
                    return -2;
                }
                d7b d7bVar = j7bVar.f;
                Arrays.fill(d7bVar.b, 0);
                Arrays.fill(d7bVar.c, 0);
                d7bVar.a = 0;
            }
            atomicInteger2 = atomicInteger2;
            b = 2;
            if (s == -2) {
                return -2;
            }
            d7b d7bVar2 = j7bVar.f;
            Arrays.fill(d7bVar2.b, 0);
            Arrays.fill(d7bVar2.c, 0);
            d7bVar2.a = 0;
        }
        while (true) {
            if (e() >= this.i.intValue()) {
                if (e() != this.i.intValue()) {
                    throw new IOException(String.format("Decoded target window size (%d bytes) does not match expected size (%d bytes)", Integer.valueOf(e()), this.i));
                }
                if (this.k) {
                    byte[] bArrH = j7bVar.c.h();
                    int i12 = this.j;
                    int iIntValue9 = this.i.intValue();
                    htb htbVar = this.m;
                    htbVar.update(bArrH, i12, iIntValue9);
                    int value = (int) htbVar.getValue();
                    htbVar.reset();
                    if (value != atomicInteger.get()) {
                        o03.a("Target data does not match checksum; this could mean that the wrong dictionary was used");
                        return 0;
                    }
                }
                if (this.e.hasRemaining()) {
                    o03.a("Excess instructions and sizes left over after decoding target window");
                    return 0;
                }
                if (d()) {
                    i = 0;
                    f(byteBuffer);
                } else {
                    if (this.f.hasRemaining()) {
                        o03.a("Excess ADD/RUN data left over after decoding target window");
                        return 0;
                    }
                    if (this.g.hasRemaining()) {
                        o03.a("Excess COPY addresses left over after decoding target window");
                        return 0;
                    }
                    byteBuffer.position(this.g.limit() + this.f.limit() + this.e.limit() + byteBuffer.position());
                    i = 0;
                }
                b();
                return i;
            }
            AtomicInteger atomicInteger3 = new AtomicInteger(0);
            AtomicInteger atomicInteger4 = new AtomicInteger(0);
            f7b f7bVar5 = this.n;
            e7b e7bVar = f7bVar5.a;
            ByteBuffer byteBuffer7 = f7bVar5.b;
            if (byteBuffer7 == null) {
                aa0.c("Internal error: getNextInstruction() called before init()");
                return 0;
            }
            f7bVar5.c = byteBuffer7.position();
            f7bVar5.e = f7bVar5.d;
            while (true) {
                short s2 = f7bVar5.d;
                if (s2 == 256) {
                    if (f7bVar5.b.hasRemaining()) {
                        byte b6 = f7bVar5.b.get();
                        byte[] bArr = e7bVar.u;
                        int i13 = b6 & MessagePack.Code.EXT_TIMESTAMP;
                        if (bArr[i13] != 0) {
                            f7bVar5.d = b6;
                        }
                        b2 = e7bVar.t[i13];
                        byte b7 = e7bVar.v[i13];
                        byte b8 = e7bVar.x[i13];
                        if (b2 != 0) {
                            b4 = b8;
                            b3 = b7;
                        }
                    }
                    b2 = 5;
                    if (b2 != 5) {
                        f(byteBuffer);
                        break;
                    }
                    i2 = atomicInteger3.get();
                    if (i2 <= this.i.intValue() || e() + i2 > this.i.intValue()) {
                        yd6 yd6Var = e7b.A;
                        if (b2 != 0) {
                            str = "NOOP";
                        } else if (b2 != 1) {
                            str = "ADD";
                        } else if (b2 != 2) {
                            str = "RUN";
                        } else if (b2 != 3) {
                            str = BuildConfig.FLAVOR;
                        } else {
                            str = "COPY";
                        }
                        throw new IOException(String.format("%s with size %d plus existing %d bytes of target data exceeds length of target window (%d bytes)", str, Integer.valueOf(i2), Integer.valueOf(e()), this.i));
                    }
                    if (b2 == 1) {
                        if (i2 > this.f.remaining()) {
                            this.n.a();
                            f(byteBuffer);
                            break;
                        }
                        c(i2, this.f);
                        b = 2;
                    } else if (b2 != b) {
                        if (b2 != 3) {
                            o03.a(pk.d(b2, "Unexpected instruction type ", " in opcode stream"));
                            return 0;
                        }
                        short s3 = (short) atomicInteger4.get();
                        int iE = e();
                        int i14 = atomicInteger2.get() + iE;
                        try {
                            int iB = j7bVar.f.b(i14, s3, this.g);
                            if (iB == -2) {
                                this.n.a();
                                f(byteBuffer);
                                break;
                            }
                            if (iB < 0 || iB > i14) {
                                throw new IllegalStateException(String.format("Internal error: unexpected address %d returned from DecodeAddress, with here_address = %d", Integer.valueOf(iB), Integer.valueOf(i14)));
                            }
                            if (iB + i2 <= atomicInteger2.get()) {
                                c(i2, (ByteBuffer) this.c.slice().position(iB));
                            } else {
                                if (iB < atomicInteger2.get()) {
                                    int i15 = atomicInteger2.get() - iB;
                                    c(i15, (ByteBuffer) this.c.slice().position(iB));
                                    iE += i15;
                                    iB += i15;
                                    i2 -= i15;
                                }
                                int i16 = iB - atomicInteger2.get();
                                ByteBuffer byteBufferK3 = j7bVar.c.k();
                                byteBufferK3.position(this.j);
                                while (true) {
                                    int i17 = iE - i16;
                                    if (i2 <= i17) {
                                        break;
                                    }
                                    c(i17, (ByteBuffer) byteBufferK3.slice().position(i16));
                                    iE += i17;
                                    i16 += i17;
                                    i2 -= i17;
                                    byteBufferK3 = j7bVar.c.k();
                                    byteBufferK3.position(this.j);
                                }
                                c(i2, (ByteBuffer) byteBufferK3.slice().position(i16));
                            }
                            b = 2;
                        } catch (IOException e) {
                            new IOException("Unable to decode address for COPY").initCause(e);
                            throw e;
                        }
                    } else {
                        if (!this.f.hasRemaining()) {
                            this.n.a();
                            f(byteBuffer);
                            break;
                        }
                        byte b9 = this.f.get();
                        for (int i18 = 0; i18 < i2; i18++) {
                            j7bVar.c.write(b9);
                        }
                        b = 2;
                    }
                } else {
                    f7bVar5.d = (short) 256;
                    byte[] bArr2 = e7bVar.u;
                    int i19 = ((byte) s2) & MessagePack.Code.EXT_TIMESTAMP;
                    b2 = bArr2[i19];
                    b3 = e7bVar.w[i19];
                    b4 = e7bVar.y[i19];
                }
                if (b3 == 0) {
                    try {
                        atomicInteger3.set(kcb.b(f7bVar5.b));
                    } catch (kcb.a unused4) {
                        f7bVar5.a();
                        b2 = 5;
                    } catch (kcb.b unused5) {
                        o03.a("Instruction size is not a valid variable-length integer");
                        return 0;
                    }
                } else {
                    atomicInteger3.set(b3);
                }
                atomicInteger4.set(b4);
                if (b2 != 5) {
                    f(byteBuffer);
                    break;
                }
                i2 = atomicInteger3.get();
                if (i2 <= this.i.intValue()) {
                }
                yd6 yd6Var2 = e7b.A;
                if (b2 != 0) {
                    str = "NOOP";
                } else if (b2 != 1) {
                    str = "ADD";
                } else if (b2 != 2) {
                    str = "RUN";
                } else if (b2 != 3) {
                    str = BuildConfig.FLAVOR;
                } else {
                    str = "COPY";
                }
                throw new IOException(String.format("%s with size %d plus existing %d bytes of target data exceeds length of target window (%d bytes)", str, Integer.valueOf(i2), Integer.valueOf(e()), this.i));
            }
        }
        if (d() && this.h > 0) {
            return -2;
        }
        o03.a("End of data reached while decoding VCDIFF delta file");
        return 0;
    }

    public final void b() {
        this.b = false;
        j7b j7bVar = this.a;
        this.j = j7bVar != null ? j7bVar.c.size() : 0;
        this.i = 0;
        this.c = null;
        this.d.set(0);
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = 0;
        this.k = false;
        this.l.set(0);
    }

    public final void c(int i, ByteBuffer byteBuffer) throws IOException {
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return;
            }
            this.a.c.write(byteBuffer.get());
            i = i2;
        }
    }

    public final boolean d() {
        ByteBuffer byteBuffer = this.g;
        ByteBuffer byteBuffer2 = this.e;
        return byteBuffer == byteBuffer2 && this.f == byteBuffer2;
    }

    public final int e() {
        return this.a.c.size() - this.j;
    }

    public final void f(ByteBuffer byteBuffer) {
        if (d()) {
            int iPosition = this.e.position();
            this.h -= iPosition;
            byteBuffer.position(byteBuffer.position() + iPosition);
        }
    }
}
