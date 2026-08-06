package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class q64<T> implements s54 {
    public final /* synthetic */ s54<T> t;
    public final /* synthetic */ gl8<Throwable> u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {154}, m = "emit", v = 1)
    public static final class a extends u02 {
        public /* synthetic */ Object t;
        public final /* synthetic */ q64<T> u;
        public int v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(q64<? super T> q64Var, r02<? super a> r02Var) {
            super(r02Var);
            this.u = q64Var;
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.t = obj;
            this.v |= Integer.MIN_VALUE;
            return this.u.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q64(s54<? super T> s54Var, gl8<Throwable> gl8Var) {
        this.t = s54Var;
        this.u = gl8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.Throwable] */
    @Override // defpackage.s54
    public final Object emit(T t, r02<? super g2b> r02Var) throws Throwable {
        a aVar;
        if (r02Var instanceof a) {
            aVar = (a) r02Var;
            int i = aVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.v = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, r02Var);
            }
        } else {
            aVar = new a(this, r02Var);
        }
        Object obj = aVar.t;
        int i2 = aVar.v;
        try {
            if (i2 == 0) {
                dv8.b(obj);
                s54<T> s54Var = this.t;
                aVar.v = 1;
                Object objEmit = s54Var.emit(t, aVar);
                v72 v72Var = v72.t;
                if (objEmit == v72Var) {
                    return v72Var;
                }
            } else {
                if (i2 != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            this = (q64<T>) g2b.a;
            return this;
        } catch (Throwable 
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
            	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:372)
            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:89)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
            */
        /*
            this = this;
            boolean r0 = r6 instanceof q64.a
            if (r0 == 0) goto L13
            r0 = r6
            q64$a r0 = (q64.a) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            q64$a r0 = new q64$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.t
            int r1 = r0.v
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.dv8.b(r6)     // Catch: java.lang.Throwable -> L25
            goto L3e
        L25:
            r5 = move-exception
            goto L41
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.dv8.b(r6)
            s54<T> r6 = r4.t     // Catch: java.lang.Throwable -> L25
            r0.v = r2     // Catch: java.lang.Throwable -> L25
            java.lang.Object r4 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L25
            v72 r5 = defpackage.v72.t
            if (r4 != r5) goto L3e
            return r5
        L3e:
            g2b r4 = defpackage.g2b.a
            return r4
        L41:
            gl8<java.lang.Throwable> r4 = r4.u
            r4.t = r5
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q64.emit(java.lang.Object, r02):java.lang.Object");
    }
}
