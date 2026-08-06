package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pyc implements xhc {
    public final /* synthetic */ String a;
    public final /* synthetic */ pzc b;
    public final /* synthetic */ lzc c;

    public pyc(lzc lzcVar, String str, pzc pzcVar) {
        this.a = str;
        this.b = pzcVar;
        this.c = lzcVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0026 A[Catch: all -> 0x0016, TRY_ENTER, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0013, B:20:0x005f, B:23:0x0083, B:14:0x0026, B:16:0x004c, B:18:0x0057, B:19:0x005b), top: B:28:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x004c A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0013, B:20:0x005f, B:23:0x0083, B:14:0x0026, B:16:0x004c, B:18:0x0057, B:19:0x005b), top: B:28:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0057 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0013, B:20:0x005f, B:23:0x0083, B:14:0x0026, B:16:0x004c, B:18:0x0057, B:19:0x005b), top: B:28:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x005b A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0013, B:20:0x005f, B:23:0x0083, B:14:0x0026, B:16:0x004c, B:18:0x0057, B:19:0x005b), top: B:28:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x005f A[Catch: all -> 0x0016, PHI: r6
      0x005f: PHI (r6v7 int) = (r6v1 int), (r6v0 int) binds: [B:13:0x0024, B:11:0x0021] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0013, B:20:0x005f, B:23:0x0083, B:14:0x0026, B:16:0x004c, B:18:0x0057, B:19:0x005b), top: B:28:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0082  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.xhc
    public final void a(String str, int i, Throwable th, byte[] bArr, Map map) {
        dic dicVar;
        p8c p8cVar;
        String strSubstring;
        Object obj;
        long j = this.b.a;
        lzc lzcVar = this.c;
        lzcVar.e().g();
        lzcVar.m0();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                lzcVar.u = false;
                lzcVar.O();
            }
        }
        String str2 = this.a;
        if (i == 200) {
            if (th == null) {
                p8c p8cVar2 = lzcVar.c;
                lzc.U(p8cVar2);
                p8cVar2.n(Long.valueOf(j));
                lzcVar.b().n.c(str2, Integer.valueOf(i), "Successfully uploaded batch from upload queue. appId, status");
                dicVar = lzcVar.b;
                lzc.U(dicVar);
                if (dicVar.k()) {
                    p8cVar = lzcVar.c;
                    lzc.U(p8cVar);
                    if (p8cVar.m(str2)) {
                        lzcVar.t(str2);
                    } else {
                        lzcVar.N();
                    }
                } else {
                    lzcVar.N();
                }
            } else {
                String str3 = new String(bArr, StandardCharsets.UTF_8);
                strSubstring = str3.substring(0, Math.min(32, str3.length()));
                phc phcVar = lzcVar.b().k;
                Integer numValueOf = Integer.valueOf(i);
                obj = th;
                if (th == null) {
                    obj = strSubstring;
                }
                phcVar.d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf, obj);
                p8c p8cVar3 = lzcVar.c;
                lzc.U(p8cVar3);
                p8cVar3.s(Long.valueOf(j));
                lzcVar.N();
            }
        } else if (i == 204) {
            i = 204;
            if (th == null) {
                p8c p8cVar4 = lzcVar.c;
                lzc.U(p8cVar4);
                p8cVar4.n(Long.valueOf(j));
                lzcVar.b().n.c(str2, Integer.valueOf(i), "Successfully uploaded batch from upload queue. appId, status");
                dicVar = lzcVar.b;
                lzc.U(dicVar);
                if (dicVar.k()) {
                    p8cVar = lzcVar.c;
                    lzc.U(p8cVar);
                    if (p8cVar.m(str2)) {
                        lzcVar.t(str2);
                    } else {
                        lzcVar.N();
                    }
                } else {
                    lzcVar.N();
                }
            } else {
                String str4 = new String(bArr, StandardCharsets.UTF_8);
                strSubstring = str4.substring(0, Math.min(32, str4.length()));
                phc phcVar2 = lzcVar.b().k;
                Integer numValueOf2 = Integer.valueOf(i);
                obj = th;
                if (th == null) {
                    obj = strSubstring;
                }
                phcVar2.d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf2, obj);
                p8c p8cVar5 = lzcVar.c;
                lzc.U(p8cVar5);
                p8cVar5.s(Long.valueOf(j));
                lzcVar.N();
            }
        } else {
            String str5 = new String(bArr, StandardCharsets.UTF_8);
            strSubstring = str5.substring(0, Math.min(32, str5.length()));
            phc phcVar3 = lzcVar.b().k;
            Integer numValueOf3 = Integer.valueOf(i);
            obj = th;
            if (th == null) {
                obj = strSubstring;
            }
            phcVar3.d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf3, obj);
            p8c p8cVar6 = lzcVar.c;
            lzc.U(p8cVar6);
            p8cVar6.s(Long.valueOf(j));
            lzcVar.N();
        }
    }
}
