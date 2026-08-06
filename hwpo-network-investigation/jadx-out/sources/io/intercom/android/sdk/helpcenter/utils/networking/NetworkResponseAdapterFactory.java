package io.intercom.android.sdk.helpcenter.utils.networking;

import defpackage.aa0;
import defpackage.g2b;
import defpackage.mc3;
import defpackage.mv8;
import defpackage.oh4;
import defpackage.p21;
import defpackage.q21;
import defpackage.qq2;
import defpackage.xj5;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class NetworkResponseAdapterFactory extends q21.a {
    public static final int $stable = 0;
    private final oh4<Throwable, g2b> onClientError;

    public /* synthetic */ NetworkResponseAdapterFactory(oh4 oh4Var, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? new mc3(1) : oh4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b _init_$lambda$0(Throwable th) {
        th.getClass();
        return g2b.a;
    }

    @Override // q21.a
    public q21<?, ?> get(Type type, Annotation[] annotationArr, mv8 mv8Var) {
        type.getClass();
        annotationArr.getClass();
        mv8Var.getClass();
        if (p21.class.equals(q21.a.getRawType(type))) {
            if (!(type instanceof ParameterizedType)) {
                aa0.c("return type must be parameterized as Call<NetworkResponse<<Foo>>");
                return null;
            }
            Type parameterUpperBound = q21.a.getParameterUpperBound(0, (ParameterizedType) type);
            if (xj5.a(q21.a.getRawType(parameterUpperBound), NetworkResponse.class)) {
                if (!(parameterUpperBound instanceof ParameterizedType)) {
                    aa0.c("Response must be parameterized as NetworkResponse<Foo> or NetworkResponse<out Foo>");
                    return null;
                }
                Type parameterUpperBound2 = q21.a.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
                parameterUpperBound2.getClass();
                return new NetworkResponseAdapter(parameterUpperBound2, this.onClientError);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkResponseAdapterFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkResponseAdapterFactory(oh4<? super Throwable, g2b> oh4Var) {
        oh4Var.getClass();
        this.onClientError = oh4Var;
    }
}
