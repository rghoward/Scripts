package io.intercom.android.sdk.m5.conversation.data;

import defpackage.a74;
import defpackage.aa0;
import defpackage.dv8;
import defpackage.ea1;
import defpackage.ff3;
import defpackage.g2b;
import defpackage.hf3;
import defpackage.r02;
import defpackage.r54;
import defpackage.s54;
import defpackage.t30;
import defpackage.u02;
import defpackage.v72;
import defpackage.xm2;
import defpackage.xx0;
import defpackage.z;
import defpackage.zl9;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.AblyManager;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.FeatureFlag;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CombinedEventAsFlowKt {
    public static final r54<ParsedNexusEvent> combinedEventAsFlow(NexusClient nexusClient, final AblyManager ablyManager) {
        nexusClient.getClass();
        ablyManager.getClass();
        final r54<ParsedNexusEvent> r54VarNexusEventAsFlow = NexusEventAsFlowKt.nexusEventAsFlow(nexusClient);
        if (((AppConfig) z.a()).hasFeature(FeatureFlag.ABLY_REALTIME_DISABLED)) {
            return r54VarNexusEventAsFlow;
        }
        final zl9<ParsedAblyEvent> sharedEventFlow = ablyManager.getSharedEventFlow();
        final r54<ParsedAblyEvent> r54Var = new r54<ParsedAblyEvent>() { // from class: io.intercom.android.sdk.m5.conversation.data.CombinedEventAsFlowKt$combinedEventAsFlow$$inlined$filter$1

            /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.data.CombinedEventAsFlowKt$combinedEventAsFlow$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class AnonymousClass2<T> implements s54 {
                final /* synthetic */ s54 $this_unsafeFlow;

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.data.CombinedEventAsFlowKt$combinedEventAsFlow$$inlined$filter$1$2$1, reason: invalid class name */
                @xm2(c = "io.intercom.android.sdk.m5.conversation.data.CombinedEventAsFlowKt$combinedEventAsFlow$$inlined$filter$1$2", f = "CombinedEventAsFlow.kt", l = {50}, m = "emit")
                public static final class AnonymousClass1 extends u02 {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(r02 r02Var) {
                        super(r02Var);
                    }

                    @Override // defpackage.ak0
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(s54 s54Var) {
                    this.$this_unsafeFlow = s54Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.s54
                public final Object emit(Object obj, r02 r02Var) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (r02Var instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) r02Var;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(r02Var);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(r02Var);
                    }
                    Object obj2 = anonymousClass1.result;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        dv8.b(obj2);
                        s54 s54Var = this.$this_unsafeFlow;
                        ParsedAblyEvent parsedAblyEvent = (ParsedAblyEvent) obj;
                        if ((parsedAblyEvent instanceof ParsedAblyEvent.ConversationAblyEvent.NewComment) || (parsedAblyEvent instanceof ParsedAblyEvent.AblyReconnectedWithoutResume)) {
                            anonymousClass1.label = 1;
                            Object objEmit = s54Var.emit(obj, anonymousClass1);
                            v72 v72Var = v72.t;
                            if (objEmit == v72Var) {
                                return v72Var;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            aa0.c("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dv8.b(obj2);
                    }
                    return g2b.a;
                }
            }

            @Override // defpackage.r54
            public Object collect(s54<? super ParsedAblyEvent> s54Var, r02 r02Var) {
                Object objCollect = sharedEventFlow.collect(new AnonymousClass2(s54Var), r02Var);
                return objCollect == v72.t ? objCollect : g2b.a;
            }
        };
        r54[] r54VarArr = {new r54<ParsedNexusEvent>() { // from class: io.intercom.android.sdk.m5.conversation.data.CombinedEventAsFlowKt$combinedEventAsFlow$$inlined$map$1

            /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.data.CombinedEventAsFlowKt$combinedEventAsFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class AnonymousClass2<T> implements s54 {
                final /* synthetic */ s54 $this_unsafeFlow;

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.data.CombinedEventAsFlowKt$combinedEventAsFlow$$inlined$map$1$2$1, reason: invalid class name */
                @xm2(c = "io.intercom.android.sdk.m5.conversation.data.CombinedEventAsFlowKt$combinedEventAsFlow$$inlined$map$1$2", f = "CombinedEventAsFlow.kt", l = {50}, m = "emit")
                public static final class AnonymousClass1 extends u02 {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(r02 r02Var) {
                        super(r02Var);
                    }

                    @Override // defpackage.ak0
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(s54 s54Var) {
                    this.$this_unsafeFlow = s54Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
                @Override // defpackage.s54
                public final Object emit(Object obj, r02 r02Var) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    ParsedNexusEvent newComment;
                    if (r02Var instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) r02Var;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(r02Var);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(r02Var);
                    }
                    Object obj2 = anonymousClass1.result;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        dv8.b(obj2);
                        s54 s54Var = this.$this_unsafeFlow;
                        ParsedAblyEvent parsedAblyEvent = (ParsedAblyEvent) obj;
                        if (parsedAblyEvent instanceof ParsedAblyEvent.ConversationAblyEvent.NewComment) {
                            ParsedAblyEvent.ConversationAblyEvent.NewComment newComment2 = (ParsedAblyEvent.ConversationAblyEvent.NewComment) parsedAblyEvent;
                            newComment = new ParsedNexusEvent.ConversationNexusEvent.NewComment(newComment2.getConversationId(), newComment2.getCreatedByUser(), newComment2.getTicketId(), newComment2.getPartBuilder());
                        } else {
                            newComment = parsedAblyEvent instanceof ParsedAblyEvent.AblyReconnectedWithoutResume ? ParsedNexusEvent.AblyReconnectedWithoutResume.INSTANCE : ParsedNexusEvent.UnSupportedEvent.INSTANCE;
                        }
                        anonymousClass1.label = 1;
                        Object objEmit = s54Var.emit(newComment, anonymousClass1);
                        Object obj3 = v72.t;
                        if (objEmit == obj3) {
                            return obj3;
                        }
                    } else {
                        if (i2 != 1) {
                            aa0.c("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dv8.b(obj2);
                    }
                    return g2b.a;
                }
            }

            @Override // defpackage.r54
            public Object collect(s54<? super ParsedNexusEvent> s54Var, r02 r02Var) {
                Object objCollect = r54Var.collect(new AnonymousClass2(s54Var), r02Var);
                return objCollect == v72.t ? objCollect : g2b.a;
            }
        }, new r54<ParsedNexusEvent>() { // from class: io.intercom.android.sdk.m5.conversation.data.CombinedEventAsFlowKt$combinedEventAsFlow$$inlined$filter$2

            /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.data.CombinedEventAsFlowKt$combinedEventAsFlow$$inlined$filter$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class AnonymousClass2<T> implements s54 {
                final /* synthetic */ AblyManager $ablyManager$inlined;
                final /* synthetic */ s54 $this_unsafeFlow;

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.data.CombinedEventAsFlowKt$combinedEventAsFlow$$inlined$filter$2$2$1, reason: invalid class name */
                @xm2(c = "io.intercom.android.sdk.m5.conversation.data.CombinedEventAsFlowKt$combinedEventAsFlow$$inlined$filter$2$2", f = "CombinedEventAsFlow.kt", l = {50}, m = "emit")
                public static final class AnonymousClass1 extends u02 {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(r02 r02Var) {
                        super(r02Var);
                    }

                    @Override // defpackage.ak0
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(s54 s54Var, AblyManager ablyManager) {
                    this.$this_unsafeFlow = s54Var;
                    this.$ablyManager$inlined = ablyManager;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.s54
                public final Object emit(Object obj, r02 r02Var) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (r02Var instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) r02Var;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(r02Var);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(r02Var);
                    }
                    Object obj2 = anonymousClass1.result;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        dv8.b(obj2);
                        s54 s54Var = this.$this_unsafeFlow;
                        if (!((((ParsedNexusEvent) obj) instanceof ParsedNexusEvent.ConversationNexusEvent.NewComment) && this.$ablyManager$inlined.isConnected())) {
                            anonymousClass1.label = 1;
                            Object objEmit = s54Var.emit(obj, anonymousClass1);
                            v72 v72Var = v72.t;
                            if (objEmit == v72Var) {
                                return v72Var;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            aa0.c("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dv8.b(obj2);
                    }
                    return g2b.a;
                }
            }

            @Override // defpackage.r54
            public Object collect(s54<? super ParsedNexusEvent> s54Var, r02 r02Var) {
                Object objCollect = r54VarNexusEventAsFlow.collect(new AnonymousClass2(s54Var, ablyManager), r02Var);
                return objCollect == v72.t ? objCollect : g2b.a;
            }
        }};
        int i = a74.a;
        return new ea1(r54VarArr.length == 0 ? hf3.t : new t30(r54VarArr), ff3.t, -2, xx0.t);
    }
}
