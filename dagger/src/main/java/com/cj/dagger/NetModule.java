package com.cj.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * 第三方框架  没法在构造函数上添加@inject  自己写的类 构造函数是一种注入方式
 * 第二种通过module注入
 */
@Module
public class NetModule {


//
//    //依赖的对象 已经通过注入方式提供了  直接通过函数传参就可以了 它通过上面函数
//    @Provides
//    public ApiService providerService(Retrofit retrofit){
//        return retrofit.create(ApiService.class);
//    }
//

    /**
     * OkHttpClient是第三方框架中的  没法通过在构造函数上是用@inject注解
     * 所以通过依赖注入的第二种方式 module 提供，module必须安装到一个component中
     *
     * @return
     */
    @Singleton
    @Provides
    public OkHttpClient provideOkHttp(){
        return new OkHttpClient.Builder().build();
    }

    /**
     *
     * @param okHttpClient
     * @return
     * 因为okHttpClient对象已经创建好了  这里直接作为参数传递过来就可以
     */
    @Provides
    public Retrofit provideRetrofit(OkHttpClient okHttpClient){
        return new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("http://www.baidu.com").build();
    }
}
