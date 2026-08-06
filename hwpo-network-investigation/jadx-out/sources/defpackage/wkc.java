package defpackage;

import android.os.Build;
import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wkc extends u1c implements h3c {
    private static final wkc zzaw;
    private static volatile o3c zzax;
    private long zzA;
    private int zzB;
    private String zzC;
    private String zzD;
    private boolean zzE;
    private i2c zzF;
    private String zzG;
    private int zzH;
    private int zzI;
    private int zzJ;
    private String zzK;
    private long zzL;
    private long zzM;
    private String zzN;
    private String zzO;
    private int zzP;
    private String zzQ;
    private clc zzR;
    private d2c zzS;
    private long zzT;
    private long zzU;
    private String zzV;
    private String zzW;
    private int zzX;
    private boolean zzY;
    private String zzZ;
    private boolean zzaa;
    private ekc zzab;
    private String zzac;
    private i2c zzad;
    private String zzae;
    private long zzaf;
    private boolean zzag;
    private String zzah;
    private boolean zzai;
    private String zzaj;
    private int zzak;
    private String zzal;
    private uic zzam;
    private int zzan;
    private mic zzao;
    private String zzap;
    private xlc zzaq;
    private long zzar;
    private String zzas;
    private ljc zzat;
    private String zzau;
    private i2c zzav;
    private int zzb;
    private int zze;
    private int zzf;
    private i2c zzg;
    private i2c zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private int zzr;
    private String zzs;
    private String zzt;
    private String zzu;
    private long zzv;
    private long zzw;
    private String zzx;
    private boolean zzy;
    private String zzz;

    static {
        wkc wkcVar = new wkc();
        zzaw = wkcVar;
        u1c.s(wkc.class, wkcVar);
    }

    public wkc() {
        r3c r3cVar = r3c.x;
        this.zzg = r3cVar;
        this.zzh = r3cVar;
        this.zzn = BuildConfig.FLAVOR;
        this.zzo = BuildConfig.FLAVOR;
        this.zzp = BuildConfig.FLAVOR;
        this.zzq = BuildConfig.FLAVOR;
        this.zzs = BuildConfig.FLAVOR;
        this.zzt = BuildConfig.FLAVOR;
        this.zzu = BuildConfig.FLAVOR;
        this.zzx = BuildConfig.FLAVOR;
        this.zzz = BuildConfig.FLAVOR;
        this.zzC = BuildConfig.FLAVOR;
        this.zzD = BuildConfig.FLAVOR;
        this.zzF = r3cVar;
        this.zzG = BuildConfig.FLAVOR;
        this.zzK = BuildConfig.FLAVOR;
        this.zzN = BuildConfig.FLAVOR;
        this.zzO = BuildConfig.FLAVOR;
        this.zzQ = BuildConfig.FLAVOR;
        this.zzS = v1c.x;
        this.zzV = BuildConfig.FLAVOR;
        this.zzW = BuildConfig.FLAVOR;
        this.zzZ = BuildConfig.FLAVOR;
        this.zzac = BuildConfig.FLAVOR;
        this.zzad = r3cVar;
        this.zzae = BuildConfig.FLAVOR;
        this.zzah = BuildConfig.FLAVOR;
        this.zzaj = BuildConfig.FLAVOR;
        this.zzal = BuildConfig.FLAVOR;
        this.zzap = BuildConfig.FLAVOR;
        this.zzas = BuildConfig.FLAVOR;
        this.zzau = BuildConfig.FLAVOR;
        this.zzav = r3cVar;
    }

    public static ukc c0() {
        return (ukc) zzaw.o();
    }

    public static ukc d0(wkc wkcVar) {
        p1c p1cVarO = zzaw.o();
        p1cVarO.l(wkcVar);
        return (ukc) p1cVarO;
    }

    public final long A() {
        return this.zzv;
    }

    public final long A0() {
        return this.zzT;
    }

    public final /* synthetic */ void A1(int i) {
        this.zzb |= 1024;
        this.zzr = i;
    }

    public final boolean B() {
        return (this.zzb & 32768) != 0;
    }

    public final boolean B0() {
        return (this.zze & 128) != 0;
    }

    public final /* synthetic */ void B1(String str) {
        str.getClass();
        this.zzb |= AudioConstants.AUDIO_FILE_BUFFER_SIZE;
        this.zzs = str;
    }

    public final long C() {
        return this.zzw;
    }

    public final String C0() {
        return this.zzW;
    }

    public final /* synthetic */ void C1(String str) {
        str.getClass();
        this.zzb |= 4096;
        this.zzt = str;
    }

    public final String D() {
        return this.zzx;
    }

    public final boolean D0() {
        return (this.zze & 8192) != 0;
    }

    public final /* synthetic */ void D1(String str) {
        str.getClass();
        this.zzb |= 8192;
        this.zzu = str;
    }

    public final boolean E() {
        return (this.zzb & 131072) != 0;
    }

    public final String E0() {
        return this.zzac;
    }

    public final /* synthetic */ void E1(long j) {
        this.zzb |= 16384;
        this.zzv = j;
    }

    public final boolean F() {
        return this.zzy;
    }

    public final boolean F0() {
        return (this.zze & 32768) != 0;
    }

    public final /* synthetic */ void F1() {
        this.zzb |= 32768;
        this.zzw = 161000L;
    }

    public final String G() {
        return this.zzz;
    }

    public final long G0() {
        return this.zzaf;
    }

    public final /* synthetic */ void G1(String str) {
        str.getClass();
        this.zzb |= 65536;
        this.zzx = str;
    }

    public final boolean H() {
        return (this.zzb & 524288) != 0;
    }

    public final boolean H0() {
        return this.zzag;
    }

    public final /* synthetic */ void H1() {
        this.zzb &= -65537;
        this.zzx = zzaw.zzx;
    }

    public final long I() {
        return this.zzA;
    }

    public final boolean I0() {
        return (this.zze & 131072) != 0;
    }

    public final /* synthetic */ void I1(boolean z) {
        this.zzb |= 131072;
        this.zzy = z;
    }

    public final boolean J() {
        return (this.zzb & 1048576) != 0;
    }

    public final String J0() {
        return this.zzah;
    }

    public final /* synthetic */ void J1() {
        this.zzb &= -131073;
        this.zzy = false;
    }

    public final int K() {
        return this.zzB;
    }

    public final boolean K0() {
        return (this.zze & 262144) != 0;
    }

    public final /* synthetic */ void K1(String str) {
        this.zzb |= 262144;
        this.zzz = str;
    }

    public final String L() {
        return this.zzC;
    }

    public final boolean L0() {
        return this.zzai;
    }

    public final /* synthetic */ void L1() {
        this.zzb &= -262145;
        this.zzz = zzaw.zzz;
    }

    public final String M() {
        return this.zzD;
    }

    public final boolean M0() {
        return (this.zze & 524288) != 0;
    }

    public final /* synthetic */ void M1(long j) {
        this.zzb |= 524288;
        this.zzA = j;
    }

    public final boolean N() {
        return (this.zzb & 8388608) != 0;
    }

    public final String N0() {
        return this.zzaj;
    }

    public final /* synthetic */ void N1(int i) {
        this.zzb |= 1048576;
        this.zzB = i;
    }

    public final boolean O() {
        return this.zzE;
    }

    public final int O0() {
        return this.zzak;
    }

    public final /* synthetic */ void O1(String str) {
        this.zzb |= 2097152;
        this.zzC = str;
    }

    public final i2c P() {
        return this.zzF;
    }

    public final boolean P0() {
        return (this.zze & 4194304) != 0;
    }

    public final /* synthetic */ void P1() {
        this.zzb &= -2097153;
        this.zzC = zzaw.zzC;
    }

    public final String Q() {
        return this.zzG;
    }

    public final uic Q0() {
        uic uicVar = this.zzam;
        return uicVar == null ? uic.F() : uicVar;
    }

    public final /* synthetic */ void Q1(String str) {
        str.getClass();
        this.zzb |= 4194304;
        this.zzD = str;
    }

    public final boolean R() {
        return (this.zzb & 33554432) != 0;
    }

    public final boolean R0() {
        return (this.zze & 8388608) != 0;
    }

    public final /* synthetic */ void R1() {
        this.zzb |= 8388608;
        this.zzE = false;
    }

    public final int S() {
        return this.zzH;
    }

    public final int S0() {
        return this.zzan;
    }

    public final void S1(ArrayList arrayList) {
        i2c i2cVar = this.zzF;
        if (!i2cVar.a()) {
            this.zzF = j3c.a(i2cVar);
        }
        f0c.i(arrayList, this.zzF);
    }

    public final boolean T() {
        return (this.zzb & 536870912) != 0;
    }

    public final boolean T0() {
        return (this.zze & 16777216) != 0;
    }

    public final void T1() {
        this.zzF = r3c.x;
    }

    public final long U() {
        return this.zzL;
    }

    public final mic U0() {
        mic micVar = this.zzao;
        return micVar == null ? mic.d0() : micVar;
    }

    public final /* synthetic */ void U1(String str) {
        this.zzb |= 16777216;
        this.zzG = str;
    }

    public final boolean V() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final boolean V0() {
        return (this.zze & 67108864) != 0;
    }

    public final /* synthetic */ void V1(int i) {
        this.zzb |= 33554432;
        this.zzH = i;
    }

    public final String W() {
        return this.zzN;
    }

    public final xlc W0() {
        xlc xlcVar = this.zzaq;
        return xlcVar == null ? xlc.z() : xlcVar;
    }

    public final /* synthetic */ void W1() {
        this.zzb &= -268435457;
        this.zzK = zzaw.zzK;
    }

    public final boolean X() {
        return (this.zzb & 1) != 0;
    }

    public final int X0() {
        return this.zzf;
    }

    public final List X1() {
        return this.zzg;
    }

    public final boolean Y() {
        return (this.zze & 134217728) != 0;
    }

    public final /* synthetic */ void Y0(long j) {
        this.zzb |= 536870912;
        this.zzL = j;
    }

    public final void Y1() {
        i2c i2cVar = this.zzg;
        if (i2cVar.a()) {
            return;
        }
        this.zzg = j3c.a(i2cVar);
    }

    public final long Z() {
        return this.zzar;
    }

    public final /* synthetic */ void Z0(String str) {
        str.getClass();
        this.zzb |= Integer.MIN_VALUE;
        this.zzN = str;
    }

    public final void Z1() {
        i2c i2cVar = this.zzh;
        if (i2cVar.a()) {
            return;
        }
        this.zzh = j3c.a(i2cVar);
    }

    public final boolean a0() {
        return (this.zze & 536870912) != 0;
    }

    public final /* synthetic */ void a1() {
        this.zzb &= Integer.MAX_VALUE;
        this.zzN = zzaw.zzN;
    }

    public final void a2(List list) {
        i2c i2cVar = this.zzav;
        if (!i2cVar.a()) {
            this.zzav = j3c.a(i2cVar);
        }
        f0c.i(list, this.zzav);
    }

    public final ljc b0() {
        ljc ljcVar = this.zzat;
        return ljcVar == null ? ljc.z() : ljcVar;
    }

    public final /* synthetic */ void b1(int i) {
        this.zze |= 2;
        this.zzP = i;
    }

    public final int b2() {
        return this.zzg.size();
    }

    public final void c1(List list) {
        RandomAccess randomAccess = this.zzS;
        if (!((g0c) randomAccess).t) {
            v1c v1cVar = (v1c) randomAccess;
            int i = v1cVar.v;
            this.zzS = v1cVar.p0(i + i);
        }
        f0c.i(list, this.zzS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final tjc c2(int i) {
        return (tjc) this.zzg.get(i);
    }

    public final /* synthetic */ void d1(long j) {
        this.zze |= 16;
        this.zzT = j;
    }

    public final i2c d2() {
        return this.zzh;
    }

    public final /* synthetic */ void e0() {
        this.zzb |= 1;
        this.zzf = 1;
    }

    public final /* synthetic */ void e1(long j) {
        this.zze |= 32;
        this.zzU = j;
    }

    public final int e2() {
        return this.zzh.size();
    }

    public final /* synthetic */ void f0(int i, tjc tjcVar) {
        Y1();
        this.zzg.set(i, tjcVar);
    }

    public final /* synthetic */ void f1(String str) {
        this.zze |= 128;
        this.zzW = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final bmc f2(int i) {
        return (bmc) this.zzh.get(i);
    }

    public final /* synthetic */ void g0(tjc tjcVar) {
        Y1();
        this.zzg.add(tjcVar);
    }

    public final /* synthetic */ void g1(String str) {
        str.getClass();
        this.zze |= 8192;
        this.zzac = str;
    }

    public final boolean g2() {
        return (this.zzb & 2) != 0;
    }

    public final /* synthetic */ void h0(Iterable iterable) {
        Y1();
        f0c.i(iterable, this.zzg);
    }

    public final /* synthetic */ void h1() {
        this.zze &= -8193;
        this.zzac = zzaw.zzac;
    }

    public final long h2() {
        return this.zzi;
    }

    public final void i0() {
        this.zzg = r3c.x;
    }

    public final void i1(Set set) {
        i2c i2cVar = this.zzad;
        if (!i2cVar.a()) {
            this.zzad = j3c.a(i2cVar);
        }
        f0c.i(set, this.zzad);
    }

    public final boolean i2() {
        return (this.zzb & 4) != 0;
    }

    public final /* synthetic */ void j0(int i) {
        Y1();
        this.zzg.remove(i);
    }

    public final /* synthetic */ void j1(String str) {
        str.getClass();
        this.zze |= 16384;
        this.zzae = str;
    }

    public final long j2() {
        return this.zzj;
    }

    public final /* synthetic */ void k0(int i, bmc bmcVar) {
        Z1();
        this.zzh.set(i, bmcVar);
    }

    public final /* synthetic */ void k1(long j) {
        this.zze |= 32768;
        this.zzaf = j;
    }

    public final boolean k2() {
        return (this.zzb & 8) != 0;
    }

    public final /* synthetic */ void l0(bmc bmcVar) {
        Z1();
        this.zzh.add(bmcVar);
    }

    public final /* synthetic */ void l1(boolean z) {
        this.zze |= 65536;
        this.zzag = z;
    }

    public final long l2() {
        return this.zzk;
    }

    public final /* synthetic */ void m0(int i) {
        Z1();
        this.zzh.remove(i);
    }

    public final /* synthetic */ void m1(String str) {
        this.zze |= 131072;
        this.zzah = str;
    }

    public final boolean m2() {
        return (this.zzb & 16) != 0;
    }

    public final /* synthetic */ void n0(long j) {
        this.zzb |= 2;
        this.zzi = j;
    }

    public final /* synthetic */ void n1(boolean z) {
        this.zze |= 262144;
        this.zzai = z;
    }

    public final long n2() {
        return this.zzl;
    }

    public final /* synthetic */ void o0() {
        this.zzb &= -3;
        this.zzi = 0L;
    }

    public final /* synthetic */ void o1(String str) {
        str.getClass();
        this.zze |= 524288;
        this.zzaj = str;
    }

    public final boolean o2() {
        return (this.zzb & 32) != 0;
    }

    public final /* synthetic */ void p0(long j) {
        this.zzb |= 4;
        this.zzj = j;
    }

    public final /* synthetic */ void p1(int i) {
        this.zze |= 1048576;
        this.zzak = i;
    }

    public final long p2() {
        return this.zzm;
    }

    public final /* synthetic */ void q0(long j) {
        this.zzb |= 8;
        this.zzk = j;
    }

    public final /* synthetic */ void q1(uic uicVar) {
        this.zzam = uicVar;
        this.zze |= 4194304;
    }

    public final String q2() {
        return this.zzn;
    }

    public final /* synthetic */ void r0(long j) {
        this.zzb |= 16;
        this.zzl = j;
    }

    public final /* synthetic */ void r1(int i) {
        this.zze |= 8388608;
        this.zzan = i;
    }

    public final String r2() {
        return this.zzo;
    }

    public final /* synthetic */ void s0() {
        this.zzb &= -17;
        this.zzl = 0L;
    }

    public final /* synthetic */ void s1(mic micVar) {
        this.zzao = micVar;
        this.zze |= 16777216;
    }

    public final String s2() {
        return this.zzp;
    }

    public final /* synthetic */ void t0(long j) {
        this.zzb |= 32;
        this.zzm = j;
    }

    public final /* synthetic */ void t1(xlc xlcVar) {
        this.zzaq = xlcVar;
        this.zze |= 67108864;
    }

    public final String t2() {
        return this.zzq;
    }

    public final /* synthetic */ void u0() {
        this.zzb &= -33;
        this.zzm = 0L;
    }

    public final /* synthetic */ void u1(long j) {
        this.zze |= 134217728;
        this.zzar = j;
    }

    public final boolean u2() {
        return (this.zzb & 1024) != 0;
    }

    public final /* synthetic */ void v0() {
        this.zzb |= 64;
        this.zzn = "android";
    }

    public final /* synthetic */ void v1(ljc ljcVar) {
        this.zzat = ljcVar;
        this.zze |= 536870912;
    }

    public final int v2() {
        return this.zzr;
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzaw, "\u0004E\u0000\u0002\u0001YE\u0000\u0006\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<Vဉ=Xဈ>Y\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", tjc.class, "zzh", bmc.class, "zzi", "zzj", "zzk", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzl", "zzE", "zzF", yic.class, "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", yhc.a, "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", zec.class});
        }
        if (i2 == 3) {
            return new wkc();
        }
        if (i2 == 4) {
            return new ukc(zzaw);
        }
        if (i2 == 5) {
            return zzaw;
        }
        if (i2 != 6) {
            throw null;
        }
        o3c o3cVar = zzax;
        if (o3cVar != null) {
            return o3cVar;
        }
        synchronized (wkc.class) {
            try {
                q1cVar = zzax;
                if (q1cVar == null) {
                    q1cVar = new q1c(zzaw);
                    zzax = q1cVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q1cVar;
    }

    public final /* synthetic */ void w0(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzo = str;
    }

    public final /* synthetic */ void w1(String str) {
        str.getClass();
        this.zze |= 1073741824;
        this.zzau = str;
    }

    public final String w2() {
        return this.zzs;
    }

    public final String x() {
        return this.zzt;
    }

    public final boolean x0() {
        return (this.zze & 2) != 0;
    }

    public final /* synthetic */ void x1() {
        String str = Build.MODEL;
        str.getClass();
        this.zzb |= 256;
        this.zzp = str;
    }

    public final String y() {
        return this.zzu;
    }

    public final int y0() {
        return this.zzP;
    }

    public final /* synthetic */ void y1() {
        this.zzb &= -257;
        this.zzp = zzaw.zzp;
    }

    public final boolean z() {
        return (this.zzb & 16384) != 0;
    }

    public final boolean z0() {
        return (this.zze & 16) != 0;
    }

    public final /* synthetic */ void z1(String str) {
        str.getClass();
        this.zzb |= 512;
        this.zzq = str;
    }
}
