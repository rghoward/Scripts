package defpackage;

import io.ably.lib.http.HttpConstants;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ae9<T> {
    /* JADX WARN: Code duplicated, block: B:386:0x08e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:387:0x08eb  */
    /* JADX WARN: Code duplicated, block: B:588:0x0902 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:0x08ed A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static y45 b(mv8 mv8Var, Class cls, Method method) {
        Type genericReturnType;
        boolean z;
        boolean z2;
        boolean z3;
        ws7<?> ws7Var;
        int i;
        int i2;
        ws7<?>[] ws7VarArr;
        int i3;
        int i4;
        ws7<?> oVar;
        ws7<?> gVar;
        ws7<?> vs7Var;
        ws7<?> vs7Var2;
        gq8.a aVar = new gq8.a(mv8Var, cls, method);
        Annotation[] annotationArr = aVar.d;
        int length = annotationArr.length;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String str = "HEAD";
            boolean z4 = true;
            ws7<?> ws7Var2 = null;
            if (i6 >= length) {
                if (aVar.o == null) {
                    throw s6b.i(method, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!aVar.p) {
                    if (aVar.r) {
                        throw s6b.i(method, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (aVar.q) {
                        throw s6b.i(method, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr2 = aVar.e;
                int length2 = annotationArr2.length;
                aVar.w = new ws7[length2];
                int i7 = length2 - 1;
                int i8 = 0;
                while (i8 < length2) {
                    ws7<?>[] ws7VarArr2 = aVar.w;
                    Type type = aVar.f[i8];
                    Annotation[] annotationArr3 = annotationArr2[i8];
                    int i9 = i8 == i7 ? 1 : i5;
                    if (annotationArr3 != null) {
                        int length3 = annotationArr3.length;
                        ws7Var = ws7Var2;
                        int i10 = i5;
                        while (i10 < length3) {
                            Annotation annotation = annotationArr3[i10];
                            Annotation[][] annotationArr4 = annotationArr2;
                            int i11 = length2;
                            if (annotation instanceof b5b) {
                                aVar.c(i8, type);
                                if (aVar.n) {
                                    throw s6b.j(method, i8, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (aVar.j) {
                                    throw s6b.j(method, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (aVar.k) {
                                    throw s6b.j(method, i8, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (aVar.l) {
                                    throw s6b.j(method, i8, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (aVar.m) {
                                    throw s6b.j(method, i8, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (aVar.s != null) {
                                    throw s6b.j(method, i8, "@Url cannot be used with @%s URL", aVar.o);
                                }
                                aVar.n = true;
                                if (type != f55.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw s6b.j(method, i8, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                oVar = new ws7.n(method, i8);
                                i = i7;
                            } else {
                                i = i7;
                                boolean z5 = annotation instanceof eu7;
                                mv8 mv8Var2 = aVar.a;
                                if (z5) {
                                    aVar.c(i8, type);
                                    if (aVar.k) {
                                        throw s6b.j(method, i8, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (aVar.l) {
                                        throw s6b.j(method, i8, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (aVar.m) {
                                        throw s6b.j(method, i8, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (aVar.n) {
                                        throw s6b.j(method, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (aVar.s == null) {
                                        throw s6b.j(method, i8, "@Path can only be used with relative url on @%s", aVar.o);
                                    }
                                    aVar.j = true;
                                    eu7 eu7Var = (eu7) annotation;
                                    String strValue = eu7Var.value();
                                    if (!gq8.a.z.matcher(strValue).matches()) {
                                        throw s6b.j(method, i8, "@Path parameter name must match %s. Found: %s", gq8.a.y.pattern(), strValue);
                                    }
                                    if (!aVar.v.contains(strValue)) {
                                        throw s6b.j(method, i8, "URL \"%s\" does not contain \"{%s}\".", aVar.s, strValue);
                                    }
                                    mv8Var2.e(type, annotationArr3);
                                    oVar = new ws7.i(aVar.c, i8, strValue, eu7Var.encoded());
                                } else {
                                    i2 = i10;
                                    ws7VarArr = ws7VarArr2;
                                    if (annotation instanceof gg8) {
                                        aVar.c(i8, type);
                                        gg8 gg8Var = (gg8) annotation;
                                        String strValue2 = gg8Var.value();
                                        boolean zEncoded = gg8Var.encoded();
                                        i3 = i9;
                                        Class<?> clsE = s6b.e(type);
                                        i4 = length3;
                                        aVar.k = true;
                                        if (!Iterable.class.isAssignableFrom(clsE)) {
                                            if (clsE.isArray()) {
                                                mv8Var2.e(gq8.a.a(clsE.getComponentType()), annotationArr3);
                                                vs7Var2 = new vs7(new ws7.j(strValue2, zEncoded));
                                            } else {
                                                mv8Var2.e(type, annotationArr3);
                                                oVar = new ws7.j<>(strValue2, zEncoded);
                                            }
                                            str = str;
                                        } else {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw s6b.j(method, i8, clsE.getSimpleName() + " must include generic type (e.g., " + clsE.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            mv8Var2.e(s6b.d(0, (ParameterizedType) type), annotationArr3);
                                            vs7Var2 = new us7(new ws7.j(strValue2, zEncoded));
                                        }
                                        oVar = vs7Var2;
                                        str = str;
                                    } else {
                                        i3 = i9;
                                        i4 = length3;
                                        if (annotation instanceof ig8) {
                                            aVar.c(i8, type);
                                            boolean zEncoded2 = ((ig8) annotation).encoded();
                                            Class<?> clsE2 = s6b.e(type);
                                            aVar.l = true;
                                            if (Iterable.class.isAssignableFrom(clsE2)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw s6b.j(method, i8, clsE2.getSimpleName() + " must include generic type (e.g., " + clsE2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                mv8Var2.e(s6b.d(0, (ParameterizedType) type), annotationArr3);
                                                vs7Var2 = new us7(new ws7.l(zEncoded2));
                                            } else if (clsE2.isArray()) {
                                                mv8Var2.e(gq8.a.a(clsE2.getComponentType()), annotationArr3);
                                                vs7Var2 = new vs7(new ws7.l(zEncoded2));
                                            } else {
                                                mv8Var2.e(type, annotationArr3);
                                                oVar = new ws7.l<>(zEncoded2);
                                            }
                                            oVar = vs7Var2;
                                        } else if (annotation instanceof hg8) {
                                            aVar.c(i8, type);
                                            Class<?> clsE3 = s6b.e(type);
                                            aVar.m = true;
                                            if (!Map.class.isAssignableFrom(clsE3)) {
                                                throw s6b.j(method, i8, "@QueryMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type typeF = s6b.f(type, clsE3);
                                            if (!(typeF instanceof ParameterizedType)) {
                                                throw s6b.j(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType = (ParameterizedType) typeF;
                                            Type typeD = s6b.d(0, parameterizedType);
                                            if (String.class != typeD) {
                                                throw s6b.j(method, i8, "@QueryMap keys must be of type String: " + typeD, new Object[0]);
                                            }
                                            mv8Var2.e(s6b.d(1, parameterizedType), annotationArr3);
                                            oVar = new ws7.k<>(method, i8, ((hg8) annotation).encoded());
                                        } else {
                                            str = str;
                                            if (annotation instanceof bu4) {
                                                aVar.c(i8, type);
                                                bu4 bu4Var = (bu4) annotation;
                                                String strValue3 = bu4Var.value();
                                                Class<?> clsE4 = s6b.e(type);
                                                if (Iterable.class.isAssignableFrom(clsE4)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw s6b.j(method, i8, clsE4.getSimpleName() + " must include generic type (e.g., " + clsE4.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    mv8Var2.e(s6b.d(0, (ParameterizedType) type), annotationArr3);
                                                    gVar = new us7(new ws7.d(strValue3, bu4Var.allowUnsafeNonAsciiValues()));
                                                } else if (clsE4.isArray()) {
                                                    mv8Var2.e(gq8.a.a(clsE4.getComponentType()), annotationArr3);
                                                    gVar = new vs7(new ws7.d(strValue3, bu4Var.allowUnsafeNonAsciiValues()));
                                                } else {
                                                    mv8Var2.e(type, annotationArr3);
                                                    oVar = new ws7.d<>(strValue3, bu4Var.allowUnsafeNonAsciiValues());
                                                }
                                                oVar = gVar;
                                            } else if (annotation instanceof eu4) {
                                                if (type == nu4.class) {
                                                    oVar = new ws7.f(method, i8);
                                                } else {
                                                    aVar.c(i8, type);
                                                    Class<?> clsE5 = s6b.e(type);
                                                    if (!Map.class.isAssignableFrom(clsE5)) {
                                                        throw s6b.j(method, i8, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                    }
                                                    Type typeF2 = s6b.f(type, clsE5);
                                                    if (!(typeF2 instanceof ParameterizedType)) {
                                                        throw s6b.j(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) typeF2;
                                                    Type typeD2 = s6b.d(0, parameterizedType2);
                                                    if (String.class != typeD2) {
                                                        throw s6b.j(method, i8, "@HeaderMap keys must be of type String: " + typeD2, new Object[0]);
                                                    }
                                                    mv8Var2.e(s6b.d(1, parameterizedType2), annotationArr3);
                                                    oVar = new ws7.e<>(method, i8, ((eu4) annotation).allowUnsafeNonAsciiValues());
                                                }
                                            } else if (annotation instanceof nu3) {
                                                aVar.c(i8, type);
                                                if (!aVar.q) {
                                                    throw s6b.j(method, i8, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                nu3 nu3Var = (nu3) annotation;
                                                String strValue4 = nu3Var.value();
                                                boolean zEncoded3 = nu3Var.encoded();
                                                aVar.g = true;
                                                Class<?> clsE6 = s6b.e(type);
                                                if (Iterable.class.isAssignableFrom(clsE6)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw s6b.j(method, i8, clsE6.getSimpleName() + " must include generic type (e.g., " + clsE6.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    mv8Var2.e(s6b.d(0, (ParameterizedType) type), annotationArr3);
                                                    gVar = new us7(new ws7.b(strValue4, zEncoded3));
                                                } else if (clsE6.isArray()) {
                                                    mv8Var2.e(gq8.a.a(clsE6.getComponentType()), annotationArr3);
                                                    gVar = new vs7(new ws7.b(strValue4, zEncoded3));
                                                } else {
                                                    mv8Var2.e(type, annotationArr3);
                                                    oVar = new ws7.b<>(strValue4, zEncoded3);
                                                }
                                                oVar = gVar;
                                            } else if (annotation instanceof qu3) {
                                                aVar.c(i8, type);
                                                if (!aVar.q) {
                                                    throw s6b.j(method, i8, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class<?> clsE7 = s6b.e(type);
                                                if (!Map.class.isAssignableFrom(clsE7)) {
                                                    throw s6b.j(method, i8, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeF3 = s6b.f(type, clsE7);
                                                if (!(typeF3 instanceof ParameterizedType)) {
                                                    throw s6b.j(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) typeF3;
                                                Type typeD3 = s6b.d(0, parameterizedType3);
                                                if (String.class != typeD3) {
                                                    throw s6b.j(method, i8, "@FieldMap keys must be of type String: " + typeD3, new Object[0]);
                                                }
                                                mv8Var2.e(s6b.d(1, parameterizedType3), annotationArr3);
                                                aVar.g = true;
                                                oVar = new ws7.c<>(method, i8, ((qu3) annotation).encoded());
                                            } else if (annotation instanceof wt7) {
                                                aVar.c(i8, type);
                                                if (!aVar.r) {
                                                    throw s6b.j(method, i8, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                wt7 wt7Var = (wt7) annotation;
                                                aVar.h = true;
                                                String strValue5 = wt7Var.value();
                                                Class<?> clsE8 = s6b.e(type);
                                                if (strValue5.isEmpty()) {
                                                    boolean zIsAssignableFrom = Iterable.class.isAssignableFrom(clsE8);
                                                    ws7.m mVar = ws7.m.a;
                                                    if (zIsAssignableFrom) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw s6b.j(method, i8, clsE8.getSimpleName() + " must include generic type (e.g., " + clsE8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        if (!n17.c.class.isAssignableFrom(s6b.e(s6b.d(0, (ParameterizedType) type)))) {
                                                            throw s6b.j(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        oVar = new us7(mVar);
                                                    } else if (clsE8.isArray()) {
                                                        if (!n17.c.class.isAssignableFrom(clsE8.getComponentType())) {
                                                            throw s6b.j(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        oVar = new vs7(mVar);
                                                    } else {
                                                        if (!n17.c.class.isAssignableFrom(clsE8)) {
                                                            throw s6b.j(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        oVar = mVar;
                                                    }
                                                } else {
                                                    String[] strArr = {"Content-Disposition", sk0.c("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", wt7Var.encoding()};
                                                    nu4 nu4Var = nu4.u;
                                                    nu4 nu4VarA = nu4.b.a(strArr);
                                                    if (Iterable.class.isAssignableFrom(clsE8)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw s6b.j(method, i8, clsE8.getSimpleName() + " must include generic type (e.g., " + clsE8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        Type typeD4 = s6b.d(0, (ParameterizedType) type);
                                                        if (n17.c.class.isAssignableFrom(s6b.e(typeD4))) {
                                                            throw s6b.j(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        vs7Var = new us7(new ws7.g(method, i8, nu4VarA, mv8Var2.c(typeD4, annotationArr3, annotationArr)));
                                                    } else if (clsE8.isArray()) {
                                                        Class<?> clsA = gq8.a.a(clsE8.getComponentType());
                                                        if (n17.c.class.isAssignableFrom(clsA)) {
                                                            throw s6b.j(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        vs7Var = new vs7(new ws7.g(method, i8, nu4VarA, mv8Var2.c(clsA, annotationArr3, annotationArr)));
                                                    } else {
                                                        if (n17.c.class.isAssignableFrom(clsE8)) {
                                                            throw s6b.j(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        gVar = new ws7.g<>(method, i8, nu4VarA, mv8Var2.c(type, annotationArr3, annotationArr));
                                                        oVar = gVar;
                                                    }
                                                    oVar = vs7Var;
                                                }
                                            } else if (annotation instanceof xt7) {
                                                aVar.c(i8, type);
                                                if (!aVar.r) {
                                                    throw s6b.j(method, i8, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                aVar.h = true;
                                                Class<?> clsE9 = s6b.e(type);
                                                if (!Map.class.isAssignableFrom(clsE9)) {
                                                    throw s6b.j(method, i8, "@PartMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeF4 = s6b.f(type, clsE9);
                                                if (!(typeF4 instanceof ParameterizedType)) {
                                                    throw s6b.j(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType4 = (ParameterizedType) typeF4;
                                                Type typeD5 = s6b.d(0, parameterizedType4);
                                                if (String.class != typeD5) {
                                                    throw s6b.j(method, i8, "@PartMap keys must be of type String: " + typeD5, new Object[0]);
                                                }
                                                Type typeD6 = s6b.d(1, parameterizedType4);
                                                if (n17.c.class.isAssignableFrom(s6b.e(typeD6))) {
                                                    throw s6b.j(method, i8, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                }
                                                oVar = new ws7.h<>(method, i8, mv8Var2.c(typeD6, annotationArr3, annotationArr), ((xt7) annotation).encoding());
                                            } else if (annotation instanceof pr0) {
                                                aVar.c(i8, type);
                                                if (aVar.q || aVar.r) {
                                                    throw s6b.j(method, i8, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                                if (aVar.i) {
                                                    throw s6b.j(method, i8, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                                try {
                                                    g52<T, qp8> g52VarC = mv8Var2.c(type, annotationArr3, annotationArr);
                                                    aVar.i = true;
                                                    oVar = new ws7.a<>(method, i8, g52VarC);
                                                } catch (RuntimeException e) {
                                                    throw s6b.k(method, e, i8, "Unable to create @Body converter for %s", type);
                                                }
                                            } else if (annotation instanceof j8a) {
                                                aVar.c(i8, type);
                                                Class<?> clsE10 = s6b.e(type);
                                                for (int i12 = i8 - 1; i12 >= 0; i12--) {
                                                    ws7<?> ws7Var3 = aVar.w[i12];
                                                    if ((ws7Var3 instanceof ws7.o) && ((ws7.o) ws7Var3).a.equals(clsE10)) {
                                                        throw s6b.j(method, i8, "@Tag type " + clsE10.getName() + " is duplicate of " + k08.b.a(method, i12) + " and would always overwrite its value.", new Object[0]);
                                                    }
                                                }
                                                oVar = new ws7.o<>(clsE10);
                                            } else {
                                                oVar = null;
                                            }
                                        }
                                        str = str;
                                    }
                                }
                                if (oVar != null) {
                                    if (ws7Var == null) {
                                        throw s6b.j(method, i8, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                    }
                                    ws7Var = oVar;
                                }
                                i10 = i2 + 1;
                                annotationArr2 = annotationArr4;
                                i7 = i;
                                length2 = i11;
                                i9 = i3;
                                ws7VarArr2 = ws7VarArr;
                                length3 = i4;
                                str = str;
                            }
                            i2 = i10;
                            ws7VarArr = ws7VarArr2;
                            i3 = i9;
                            i4 = length3;
                            if (oVar != null) {
                                if (ws7Var == null) {
                                    throw s6b.j(method, i8, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                                ws7Var = oVar;
                            }
                            i10 = i2 + 1;
                            annotationArr2 = annotationArr4;
                            i7 = i;
                            length2 = i11;
                            i9 = i3;
                            ws7VarArr2 = ws7VarArr;
                            length3 = i4;
                            str = str;
                        }
                    } else {
                        ws7Var = null;
                    }
                    Annotation[][] annotationArr5 = annotationArr2;
                    int i13 = length2;
                    String str2 = str;
                    int i14 = i7;
                    ws7<?>[] ws7VarArr3 = ws7VarArr2;
                    int i15 = i9;
                    if (ws7Var == null) {
                        if (i15 != 0) {
                            try {
                                if (s6b.e(type) == r02.class) {
                                    aVar.x = true;
                                    ws7Var = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw s6b.j(method, i8, "No Retrofit annotation found.", new Object[0]);
                    }
                    ws7VarArr3[i8] = ws7Var;
                    i8++;
                    annotationArr2 = annotationArr5;
                    i7 = i14;
                    length2 = i13;
                    str = str2;
                    i5 = 0;
                    ws7Var2 = null;
                }
                String str3 = str;
                if (aVar.s == null && !aVar.n) {
                    throw s6b.i(method, null, "Missing either @%s URL or @Url parameter.", aVar.o);
                }
                boolean z6 = aVar.q;
                if (!z6 && !aVar.r && !aVar.p && aVar.i) {
                    throw s6b.i(method, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z6 && !aVar.g) {
                    throw s6b.i(method, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (aVar.r && !aVar.h) {
                    throw s6b.i(method, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                gq8 gq8Var = new gq8(aVar);
                Type genericReturnType2 = method.getGenericReturnType();
                if (s6b.g(genericReturnType2)) {
                    throw s6b.i(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw s6b.i(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z7 = gq8Var.l;
                if (z7) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type typeD7 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (typeD7 instanceof WildcardType) {
                        typeD7 = ((WildcardType) typeD7).getLowerBounds()[0];
                    }
                    if (s6b.e(typeD7) == ru8.class && (typeD7 instanceof ParameterizedType)) {
                        typeD7 = s6b.d(0, (ParameterizedType) typeD7);
                        z2 = true;
                        z3 = false;
                    } else {
                        if (s6b.e(typeD7) == p21.class) {
                            throw s6b.i(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", s6b.d(0, (ParameterizedType) typeD7));
                        }
                        z3 = s6b.b && typeD7 == g2b.class;
                        z2 = false;
                    }
                    genericReturnType = new s6b.b(null, p21.class, typeD7);
                    if (!s6b.h(annotations, pr9.class)) {
                        Annotation[] annotationArr6 = new Annotation[annotations.length + 1];
                        annotationArr6[0] = qr9.b;
                        System.arraycopy(annotations, 0, annotationArr6, 1, annotations.length);
                        annotations = annotationArr6;
                    }
                    z = z3;
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z = false;
                    z2 = false;
                }
                try {
                    q21<?, ?> q21VarA = mv8Var.a(genericReturnType, annotations);
                    Type typeResponseType = q21VarA.responseType();
                    if (typeResponseType == qu8.class) {
                        throw s6b.i(method, null, "'" + s6b.e(typeResponseType).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeResponseType == ru8.class) {
                        throw s6b.i(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (gq8Var.d.equals(str3) && !Void.class.equals(typeResponseType) && (!s6b.b || typeResponseType != g2b.class)) {
                        throw s6b.i(method, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        g52<su8, T> g52VarD = mv8Var.d(typeResponseType, method.getAnnotations());
                        o21.a aVar2 = mv8Var.b;
                        if (z7) {
                            return z2 ? new y45.c(gq8Var, aVar2, g52VarD, q21VarA) : new y45.b(gq8Var, aVar2, g52VarD, q21VarA, z);
                        }
                        return new y45.a(gq8Var, aVar2, g52VarD, q21VarA);
                    } catch (RuntimeException e2) {
                        throw s6b.i(method, e2, "Unable to create converter for %s", typeResponseType);
                    }
                } catch (RuntimeException e3) {
                    throw s6b.i(method, e3, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr[i6];
            if (annotation2 instanceof wd2) {
                aVar.b(HttpConstants.Methods.DELETE, ((wd2) annotation2).value(), false);
            } else if (annotation2 instanceof ui4) {
                aVar.b(HttpConstants.Methods.GET, ((ui4) annotation2).value(), false);
            } else if (annotation2 instanceof ws4) {
                aVar.b("HEAD", ((ws4) annotation2).value(), false);
            } else if (annotation2 instanceof vn7) {
                aVar.b(HttpConstants.Methods.PATCH, ((vn7) annotation2).value(), true);
            } else if (annotation2 instanceof wn7) {
                aVar.b(HttpConstants.Methods.POST, ((wn7) annotation2).value(), true);
            } else if (annotation2 instanceof xn7) {
                aVar.b(HttpConstants.Methods.PUT, ((xn7) annotation2).value(), true);
            } else if (annotation2 instanceof fe7) {
                aVar.b("OPTIONS", ((fe7) annotation2).value(), false);
            } else if (annotation2 instanceof xs4) {
                xs4 xs4Var = (xs4) annotation2;
                aVar.b(xs4Var.method(), xs4Var.path(), xs4Var.hasBody());
            } else if (annotation2 instanceof ou4) {
                ou4 ou4Var = (ou4) annotation2;
                String[] strArrValue = ou4Var.value();
                if (strArrValue.length == 0) {
                    throw s6b.i(method, null, "@Headers annotation is empty.", new Object[0]);
                }
                boolean zAllowUnsafeNonAsciiValues = ou4Var.allowUnsafeNonAsciiValues();
                nu4.a aVar3 = new nu4.a();
                int length4 = strArrValue.length;
                int i16 = 0;
                while (i16 < length4) {
                    String str4 = strArrValue[i16];
                    int iIndexOf = str4.indexOf(58);
                    boolean z8 = z4;
                    if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str4.length() - 1) {
                        throw s6b.i(method, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str4);
                    }
                    String strSubstring = str4.substring(0, iIndexOf);
                    String strTrim = str4.substring(iIndexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                        try {
                            ol8 ol8Var = wq6.e;
                            aVar.u = wq6.a.a(strTrim);
                        } catch (IllegalArgumentException e4) {
                            throw s6b.i(method, e4, "Malformed content type: %s", strTrim);
                        }
                    } else if (zAllowUnsafeNonAsciiValues) {
                        aVar3.c(strSubstring, strTrim);
                    } else {
                        aVar3.a(strSubstring, strTrim);
                    }
                    i16++;
                    z4 = z8;
                }
                aVar.t = aVar3.d();
            } else if (annotation2 instanceof m17) {
                if (aVar.q) {
                    throw s6b.i(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                aVar.r = true;
            } else if (!(annotation2 instanceof gd4)) {
                continue;
            } else {
                if (aVar.r) {
                    throw s6b.i(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                aVar.q = true;
            }
            i6++;
        }
    }

    public abstract T a(Object obj, Object[] objArr);
}
