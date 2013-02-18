// FnordMetric Enterprise
//   (c) 2011-2013 Paul Asmuth <paul@paulasmuth.com>
//
// Licensed under the MIT License (the "License"); you may not use this
// file except in compliance with the License. You may obtain a copy of
// the License at: http://opensource.org/licenses/MIT

package com.fnordmetric.enterprise

class SumBucket(_key: BucketKey) extends AbstractBucket {
  val key = _key
  var tmp : Double = 0

  def sample(value: Double) : Unit = {
    tmp += value; println("val: " + tmp) }

  def flush : Double = {
    val res = tmp
    tmp = 0.toDouble

    println("flush: " + res)
    res
  }

}
