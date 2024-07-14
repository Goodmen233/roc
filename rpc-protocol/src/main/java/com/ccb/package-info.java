/**
 *                  客户端                                                           服务端
 *              RpcEncoder      ->              Channel     ->     RpcDecoder      ->      RpcRequestHandler
 *  RpcResponseHandler   <-  RpcDecoder    <-   Channel     <-      RpcEncoder
 */
package com.ccb;